/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.metamodel.uml.statik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.Enumerator;

@objid ("005a2ada-91e0-1f74-804b-001ec947cd2a")
public enum KindOfAccess implements Enumerator {
    READ (0, "Read", "Read"),
    WRITE (1, "Write", "Write"),
    READWRITE (2, "ReadWrite", "ReadWrite"),
    ACCESNONE (3, "AccesNone", "AccesNone");

public static final int READ_VALUE = 0;
public static final int WRITE_VALUE = 1;
public static final int READWRITE_VALUE = 2;
public static final int ACCESNONE_VALUE = 3;
private static final KindOfAccess[] VALUES_ARRAY =
new KindOfAccess[] {
READ,
WRITE,
READWRITE,
ACCESNONE,
};
public static final List<KindOfAccess> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
public static KindOfAccess get(String literal) {
  for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    KindOfAccess result = VALUES_ARRAY[i];
    if (result.toString().equals(literal)) {
       return result;
    }
  }
  return null;
}
public static KindOfAccess getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
KindOfAccess result = VALUES_ARRAY[i];
if (result.getName().equals(name)) {
return result;
}
}
return null;
}
public static KindOfAccess get(int value) {
    switch (value) {
        case READ_VALUE: return READ;
        case WRITE_VALUE: return WRITE;
        case READWRITE_VALUE: return READWRITE;
        case ACCESNONE_VALUE: return ACCESNONE;
    }
    return null;
}
private final int value;
private final String name;
private final String literal;
private KindOfAccess(int value, String name, String literal) {
  this.value = value;
  this.name = name;
  this.literal = literal;
}
public int getValue() {
   return value;
}
 public String getName() {
    return name;
}
public String getLiteral() {
  return literal;
}
 @Override
public String toString() {
   return literal;
}
}
