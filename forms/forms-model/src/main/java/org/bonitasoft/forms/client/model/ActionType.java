/**
 * Copyright (C) 2009 BonitaSoft S.A.
 * BonitaSoft, 31 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.forms.client.model;

/**
 * Type of action to execute at form submission
 * 
 * @author Anthony Birembaut
 */
public enum ActionType {
    ASSIGNMENT, JAVA_METHOD, XPATH_UPDATE_QUERY, DOCUMENT_CREATE_UPDATE, STRING_INDEX, EXECUTE_CONNECTOR, CREATE_BUSINESS_DATA, BUSINESS_DATA_JAVA_SETTER, ATTACH_EXISTING_BUSINESS_DATA;
}
