/*
 * (C) Copyright 2016-2017 Fluenda.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.fluenda.jImpfuzzy;

import java.io.IOException;

import com.fluenda.jImpfuzzy.utils.OrdLookup;
import com.github.katjahahn.parser.PEData;
import com.github.katjahahn.parser.PELoader;
import com.github.katjahahn.parser.sections.SectionLoader;
import com.github.katjahahn.parser.sections.idata.DirectoryEntry;
import com.github.katjahahn.parser.sections.idata.ImportDLL;
import com.github.katjahahn.parser.sections.idata.ImportSection;
import com.github.katjahahn.parser.sections.idata.NameImport;
import com.github.katjahahn.parser.sections.idata.OrdinalImport;
import info.debatty.java.spamsum.SpamSum;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jImpfuzzy {

    public jImpfuzzy(final String filename) throws IOException {
        List<String> exts = new ArrayList<String>(Arrays.asList("dll", "ocx", "sys"));

        PEData data = PELoader.loadPE(new File(filename));
        SectionLoader loader = new SectionLoader(data);
        ImportSection impData = loader.loadImportSection();
        List<DirectoryEntry> dirTable = impData.getDirectory();

        List<String> impstrs = new ArrayList<>();

        for(DirectoryEntry entry : dirTable) {

            ImportDLL dll = entry.toImportDLL();

            String libname = dll.getName().toLowerCase();

            String[] parts = libname.split("\\.", 2);

            if (parts.length > 1 && exts.contains(parts[1])) {
                libname = parts[0];
            }


            if (dll.getOrdinalImports().size() > 0) {
                for (OrdinalImport ordinalImport : dll.getOrdinalImports() ) {
                    impstrs.add(libname + "." + OrdLookup.lookup(libname, ordinalImport.getOrdinal(), true ));
                }
            }

            if (dll.getNameImports().size() > 0) {
                for (NameImport nameImport : dll.getNameImports()) {
                    if (libname != null) {
                        impstrs.add(libname + "." + nameImport.getName().toLowerCase());
                    }
                }
            }
        }
        String apilist = StringUtils.join(impstrs, ",");
        // impstrs.forEach(System.out::println);
        SpamSum ssdeep = new SpamSum();

        System.out.println(ssdeep.HashString(apilist));

    }
}
