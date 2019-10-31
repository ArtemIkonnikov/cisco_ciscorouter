package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_CiscoInterface
 * 	@author jkonicki
 */
public class UIM_CiscoInterface extends com.harris.netboss.common.schema.generation.classes.UIM_GenericInterface implements java.io.Serializable {


    private String InDiscards
 ;
    private String InUnknownProtos
 ;
    private String Type
 ;
    private String LastChange
 ;
    private String OutOctets
 ;
    private String InOctets
 ;
    private String InUcastPkts
 ;
    private String InError
 ;
    private String OutUcastPkts
 ;
    private String OutDiscards
 ;
    private String OutErrors
 ;

    public UIM_CiscoInterface() {


    }

   
    public String getInDiscards() {
        return this.InDiscards;
    }
    
    public void setInDiscards(String InDiscards) {
        this.InDiscards = InDiscards;
    }
    public String getInUnknownProtos() {
        return this.InUnknownProtos;
    }
    
    public void setInUnknownProtos(String InUnknownProtos) {
        this.InUnknownProtos = InUnknownProtos;
    }
    public String getType() {
        return this.Type;
    }
    
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getLastChange() {
        return this.LastChange;
    }
    
    public void setLastChange(String LastChange) {
        this.LastChange = LastChange;
    }
    public String getOutOctets() {
        return this.OutOctets;
    }
    
    public void setOutOctets(String OutOctets) {
        this.OutOctets = OutOctets;
    }
    public String getInOctets() {
        return this.InOctets;
    }
    
    public void setInOctets(String InOctets) {
        this.InOctets = InOctets;
    }
    public String getInUcastPkts() {
        return this.InUcastPkts;
    }
    
    public void setInUcastPkts(String InUcastPkts) {
        this.InUcastPkts = InUcastPkts;
    }
    public String getInError() {
        return this.InError;
    }
    
    public void setInError(String InError) {
        this.InError = InError;
    }
    public String getOutUcastPkts() {
        return this.OutUcastPkts;
    }
    
    public void setOutUcastPkts(String OutUcastPkts) {
        this.OutUcastPkts = OutUcastPkts;
    }
    public String getOutDiscards() {
        return this.OutDiscards;
    }
    
    public void setOutDiscards(String OutDiscards) {
        this.OutDiscards = OutDiscards;
    }
    public String getOutErrors() {
        return this.OutErrors;
    }
    
    public void setOutErrors(String OutErrors) {
        this.OutErrors = OutErrors;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("InDiscards").append("='").append(getInDiscards()).append("' ");			
      buffer.append("InUnknownProtos").append("='").append(getInUnknownProtos()).append("' ");			
      buffer.append("Type").append("='").append(getType()).append("' ");			
      buffer.append("LastChange").append("='").append(getLastChange()).append("' ");			
      buffer.append("OutOctets").append("='").append(getOutOctets()).append("' ");			
      buffer.append("InOctets").append("='").append(getInOctets()).append("' ");			
      buffer.append("InUcastPkts").append("='").append(getInUcastPkts()).append("' ");			
      buffer.append("InError").append("='").append(getInError()).append("' ");			
      buffer.append("OutUcastPkts").append("='").append(getOutUcastPkts()).append("' ");			
      buffer.append("OutDiscards").append("='").append(getOutDiscards()).append("' ");			
      buffer.append("OutErrors").append("='").append(getOutErrors()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


