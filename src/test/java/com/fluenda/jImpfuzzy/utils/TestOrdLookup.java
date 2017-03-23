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

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestOrdLookup {

    @Test
    public void testLookupKnownDLLWithValidOrdinal() throws Exception {
        // Test mapped dllName with valid ordinal
        Assert.assertEquals("bind", OrdLookup.lookup("ws2_32.dll", 2, true));
    }

    @Test
    public void testLookupKnownDLLWithUnkownOrdinal() throws Exception {
        // Test mapped dllName with valid ordinal
        Assert.assertEquals("ord200", OrdLookup.lookup("ws2_32.dll", 200, true));
    }

    @Test
    public void testLookupUnknownDLLWithUnkownOrdinal() throws Exception {
        // Test mapped dllName with valid ordinal
        Assert.assertEquals("ord200", OrdLookup.lookup("testtestchocolate.dll", 200, true));
    }
}