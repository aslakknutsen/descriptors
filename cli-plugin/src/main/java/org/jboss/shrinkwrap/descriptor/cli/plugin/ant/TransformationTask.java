/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.descriptor.cli.plugin.ant;

import org.apache.tools.ant.BuildException;
import org.jboss.shrinkwrap.descriptor.cli.Main;


/**
* Implementation class for the Shrinkwrap Descriptors CLI Ant task.
*
* @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
*/
public class TransformationTask extends AbstractTransformationTask
{
   /**
    * Executes the transformation task, called by Ant.
    */
   public void execute() throws BuildException
   {
      try
      {
         Main main = new Main();

         main.setContextFile(getContextFile());
         main.setTargetDir(getTargetDir());
         main.setTestDir(getTestDir());
         main.setTempDir(getTempDir());
         main.setServiceDir(getServiceDir());
         main.setTrace(isTrace());
         
         main.transform();
      }
      catch (Throwable t)
      {
         throw new BuildException(t.getMessage(), t);
      }
   }
   
}

