package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_GenericDeviceInstComponent
 * 	@author jkonicki
 */
public class UIM_GenericDeviceInstComponent extends com.harris.netboss.common.schema.generation.classes.UIM_AutonomousDeviceInstantiationComponent implements java.io.Serializable {


    private Long StatusSleep
  = new java.lang.Long(900);
    private Integer AlertSeverityLevel
  = new java.lang.Integer(3);

    public UIM_GenericDeviceInstComponent() {


    }

   
    public Long getStatusSleep() {
        return this.StatusSleep;
    }
    
    public void setStatusSleep(Long StatusSleep) {
        this.StatusSleep = StatusSleep;
    }
    public Integer getAlertSeverityLevel() {
        return this.AlertSeverityLevel;
    }
    
    public void setAlertSeverityLevel(Integer AlertSeverityLevel) {
        this.AlertSeverityLevel = AlertSeverityLevel;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("StatusSleep").append("='").append(getStatusSleep()).append("' ");			
      buffer.append("AlertSeverityLevel").append("='").append(getAlertSeverityLevel()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


