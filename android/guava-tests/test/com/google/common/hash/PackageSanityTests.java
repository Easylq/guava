/*
 * Copyright (C) 2012 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.hash;

import com.google.common.hash.BloomFilterStrategies.LockFreeBitArray;
import com.google.common.testing.AbstractPackageSanityTests;
import org.jspecify.annotations.NullUnmarked;

/**
 * Basic sanity tests for the entire package.
 *
 * @author Ben Yu
 */

@NullUnmarked
public class PackageSanityTests extends AbstractPackageSanityTests {
  public PackageSanityTests() {
    setDefault(LockFreeBitArray.class, new LockFreeBitArray(1));
    setDefault(HashCode.class, HashCode.fromInt(1));
    setDefault(String.class, "MD5");
    setDefault(int.class, 32);
  }
}
