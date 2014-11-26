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
                                    

package org.modelio.metamodel.uml.infrastructure.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.Enumerator;

@objid ("0074c304-ec87-1098-b22e-001ec947cd2a")
public enum PropertyBaseType implements Enumerator {
    STRING (0, "String", "String"),
    TEXT (1, "Text", "Text"),
    BOOLEAN (2, "Boolean", "Boolean"),
    INTEGER (3, "Integer", "Integer"),
    UNSIGNED (4, "Unsigned", "Unsigned"),
    FLOAT (5, "Float", "Float"),
    ENUMERATE (6, "Enumerate", "Enumerate"),
    DATE (7, "Date", "Date"),
    TIME (8, "Time", "Time"),
    ELEMENT (9, "Element", "Element"),
    RICHTEXT (10, "Richtext", "Richtext");

public static final int STRING_VALUE = 0;
public static final int TEXT_VALUE = 1;
public static final int BOOLEAN_VALUE = 2;
public static final int INTEGER_VALUE = 3;
public static final int UNSIGNED_VALUE = 4;
public static final int FLOAT_VALUE = 5;
public static final int ENUMERATE_VALUE = 6;
public static final int DATE_VALUE = 7;
public static final int TIME_VALUE = 8;
public static final int ELEMENT_VALUE = 9;
public static final int RICHTEXT_VALUE = 10;
private static final PropertyBaseType[] VALUES_ARRAY =
new PropertyBaseType[] {
STRING,
TEXT,
BOOLEAN,
INTEGER,
UNSIGNED,
FLOAT,
ENUMERATE,
DATE,
TIME,
ELEMENT,
RICHTEXT,
};
public static final List<PropertyBaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
public static PropertyBaseType get(String literal) {
  for (int i = 0; i < VALUES_ARRAY.length; ++i) {
    PropertyBaseType result = VALUES_ARRAY[i];
    if (result.toString().equals(literal)) {
       return result;
    }
  }
  return null;
}
public static PropertyBaseType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
PropertyBaseType result = VALUES_ARRAY[i];
if (result.getName().equals(name)) {
return result;
}
}
return null;
}
public static PropertyBaseType get(int value) {
    switch (value) {
        case STRING_VALUE: return STRING;
        case TEXT_VALUE: return TEXT;
        case BOOLEAN_VALUE: return BOOLEAN;
        case INTEGER_VALUE: return INTEGER;
        case UNSIGNED_VALUE: return UNSIGNED;
        case FLOAT_VALUE: return FLOAT;
        case ENUMERATE_VALUE: return ENUMERATE;
        case DATE_VALUE: return DATE;
        case TIME_VALUE: return TIME;
        case ELEMENT_VALUE: return ELEMENT;
        case RICHTEXT_VALUE: return RICHTEXT;
    }
    return null;
}
private final int value;
private final String name;
private final String literal;
private PropertyBaseType(int value, String name, String literal) {
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
