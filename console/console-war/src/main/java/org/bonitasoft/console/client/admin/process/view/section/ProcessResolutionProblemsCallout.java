/**
 * Copyright (C) 2014 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.console.client.admin.process.view.section;

import static org.bonitasoft.web.toolkit.client.common.i18n.AbstractI18n._;

import org.bonitasoft.console.client.admin.process.view.section.configuration.ProcessConfigurationStateResolver;
import org.bonitasoft.web.toolkit.client.ui.component.List;
import org.bonitasoft.web.toolkit.client.ui.component.Text;
import org.bonitasoft.web.toolkit.client.ui.component.callout.CalloutDanger;

/**
 * Callout listing process resolution problems
 * 
 * @author Colin PUY
 */
public class ProcessResolutionProblemsCallout extends CalloutDanger {

    protected List ul;

    public ProcessResolutionProblemsCallout(final ProcessConfigurationStateResolver stateResolver) {
        super(_("The App cannot be enabled"));
        ul = buildProblemsList(stateResolver);
        append(ul);
    }

    private List buildProblemsList(final ProcessConfigurationStateResolver stateResolver) {
        final List ul = new List();
        if (!stateResolver.areActorsResolved()) {
            ul.append(new Text(_("Entity Mapping must be resolved before enabling the App.")));
        }
        if (!stateResolver.areParametersResolved()) {
            ul.append(new Text(_("Parameters must be resolved before enabling the App.")));
        }
        if (!stateResolver.areConnectorsResolved()) {
            ul.append(new Text(_("Connector definitions must be resolved before enabling the App.")));
        }
        return ul;
    }

}
