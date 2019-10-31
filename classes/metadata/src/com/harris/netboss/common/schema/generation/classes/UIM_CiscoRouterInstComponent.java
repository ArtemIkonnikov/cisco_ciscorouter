package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_CiscoRouterInstComponent
 * 	@author jkonicki
 */
public class UIM_CiscoRouterInstComponent extends com.harris.netboss.common.schema.generation.classes.UIM_SNMPDeviceInstComponent implements java.io.Serializable {


    private String CustomAgentHome
 ;
    private String CustomAgentName
  = "Ciscorouter";
    private String CustomAgentVendor
  = "Cisco";
    private String ElementType
  = "CiscoCiscorouter";
    private String Script
  = "Main.js";

    public UIM_CiscoRouterInstComponent() {


    }

   
    public String getCustomAgentHome() {
        return this.CustomAgentHome;
    }
    
    public void setCustomAgentHome(String CustomAgentHome) {
        this.CustomAgentHome = CustomAgentHome;
    }
    public String getCustomAgentName() {
        return this.CustomAgentName;
    }
    
    public void setCustomAgentName(String CustomAgentName) {
        this.CustomAgentName = CustomAgentName;
    }
    public String getCustomAgentVendor() {
        return this.CustomAgentVendor;
    }
    
    public void setCustomAgentVendor(String CustomAgentVendor) {
        this.CustomAgentVendor = CustomAgentVendor;
    }
    public String getElementType() {
        return this.ElementType;
    }
    
    public void setElementType(String ElementType) {
        this.ElementType = ElementType;
    }
    public String getScript() {
        return this.Script;
    }
    
    public void setScript(String Script) {
        this.Script = Script;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("CustomAgentHome").append("='").append(getCustomAgentHome()).append("' ");			
      buffer.append("CustomAgentName").append("='").append(getCustomAgentName()).append("' ");			
      buffer.append("CustomAgentVendor").append("='").append(getCustomAgentVendor()).append("' ");			
      buffer.append("ElementType").append("='").append(getElementType()).append("' ");			
      buffer.append("Script").append("='").append(getScript()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


