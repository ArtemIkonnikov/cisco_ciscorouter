package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_CiscoRouterNetworkElement
 * 	@author jkonicki
 */
public class UIM_CiscoRouterNetworkElement extends com.harris.netboss.common.schema.generation.classes.UIM_GenericNetworkElement implements java.io.Serializable {


    private String Script
 ;
    private String SystemUpTimeTxt
 ;

    public UIM_CiscoRouterNetworkElement() {


    }

   
    public String getScript() {
        return this.Script;
    }
    
    public void setScript(String Script) {
        this.Script = Script;
    }
    public String getSystemUpTimeTxt() {
        return this.SystemUpTimeTxt;
    }
    
    public void setSystemUpTimeTxt(String SystemUpTimeTxt) {
        this.SystemUpTimeTxt = SystemUpTimeTxt;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("Script").append("='").append(getScript()).append("' ");			
      buffer.append("SystemUpTimeTxt").append("='").append(getSystemUpTimeTxt()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


