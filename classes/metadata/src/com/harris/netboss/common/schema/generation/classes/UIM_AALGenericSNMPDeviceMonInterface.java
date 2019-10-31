package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_AALGenericSNMPDeviceMonInterface
 * 	@author jkonicki
 */
public class UIM_AALGenericSNMPDeviceMonInterface extends com.harris.netboss.common.schema.generation.classes.UIM_GenericSNMPDeviceMonInterface implements java.io.Serializable {


    private Integer LogFileMaxBackupIndex
  = new java.lang.Integer(1);
    private Integer LogFileTrimMode
  = new java.lang.Integer(110);

    public UIM_AALGenericSNMPDeviceMonInterface() {


    }

   
    public Integer getLogFileMaxBackupIndex() {
        return this.LogFileMaxBackupIndex;
    }
    
    public void setLogFileMaxBackupIndex(Integer LogFileMaxBackupIndex) {
        this.LogFileMaxBackupIndex = LogFileMaxBackupIndex;
    }
    public Integer getLogFileTrimMode() {
        return this.LogFileTrimMode;
    }
    
    public void setLogFileTrimMode(Integer LogFileTrimMode) {
        this.LogFileTrimMode = LogFileTrimMode;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("LogFileMaxBackupIndex").append("='").append(getLogFileMaxBackupIndex()).append("' ");			
      buffer.append("LogFileTrimMode").append("='").append(getLogFileTrimMode()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


