/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.avicomponent;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class avicomponent__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_avi = null;
out.write("<H1>Helllloooo</H1>\r\n\r\n\r\n");
_global_avi = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.AviComponent.class.getName(), obj());
out.write("<div>\r\n<h1>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_avi, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

