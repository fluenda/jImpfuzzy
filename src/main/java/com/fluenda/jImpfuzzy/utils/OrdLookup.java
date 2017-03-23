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
package com.fluenda.jImpfuzzy.utils;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdLookup {

    public static String lookup(final String dllName, final int ordinal, final boolean make_name) {
        Map<String, Map<Integer, String>> ords = new HashMap<String, Map<Integer, String>>()
        {{
            put("ws2_32.dll", ws2_32.ord_names);
            put("wsock32.dll",ws2_32.ord_names);
            put("oleaut32.dll",oleaut32.ord_names);
        }};

        Map<Integer, String> names;
        names = ords.get(dllName);

        if (names == null) {
            if (make_name) {
                return String.format("ord%s", ordinal);
            }
            return null;
        }
        String name = names.get(ordinal);
        if (name == null) {
            return String.format("ord%s", ordinal);
        }
        return name;
    }
}
