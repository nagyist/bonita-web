/**
 * Copyright (C) 2012 BonitaSoft S.A.
 * 
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
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
package org.bonitasoft.web.rest.server.engineclient;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.bonitasoft.engine.api.GroupAPI;
import org.bonitasoft.engine.identity.GroupNotFoundException;
import org.bonitasoft.web.rest.server.APITestWithMock;
import org.bonitasoft.web.toolkit.client.common.exception.api.APIException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;



public class GroupEngineClientTest extends APITestWithMock {

    @Mock
    private GroupAPI groupAPI;
 
    private GroupEngineClient groupEngineClient;
    
    @Before
    public void init() {
        initMocks(this);
        groupEngineClient = new GroupEngineClient(groupAPI);
    }
    
    @Test
    public void get_get_a_group_in_engine_repository() throws Exception {
        
        groupEngineClient.get(1L);
        
        verify(groupAPI).getGroup(1L);
    }
    
    @Test(expected = APIException.class)
    public void get_throw_APIException_if_group_is_not_found_in_engine_repository() throws Exception {
        when(groupAPI.getGroup(1L)).thenThrow(new GroupNotFoundException(new Exception()));
        
        groupEngineClient.get(1L);
    }

}
