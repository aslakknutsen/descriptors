/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * EnvEntry
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
      "name",
      "type",
      "value"
})
public class EnvEntry
{
   @XmlElement(name = "env-entry-name")
   private String name;
   
   @XmlElement(name = "env-entry-type")
   private String type;
   
   @XmlElement(name = "env-entry-value")
   private String value;

   public EnvEntry()
   {
   }

   public EnvEntry(String name, String type, String value)
   {
      this.name = name;
      this.type = type;
      this.value = value;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name)
   {
      this.name = name;
   }
   
   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }
   
   /**
    * @param type the type to set
    */
   public void setType(String type)
   {
      this.type = type;
   }
   
   /**
    * @return the type
    */
   public String getType()
   {
      return type;
   }
   
   /**
    * @param value the value to set
    */
   public void setValue(String value)
   {
      this.value = value;
   }
   
   /**
    * @return the value
    */
   public String getValue()
   {
      return value;
   }
}
