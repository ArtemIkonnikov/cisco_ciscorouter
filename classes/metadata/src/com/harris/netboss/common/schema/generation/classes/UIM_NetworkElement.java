package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_NetworkElement
 * 	@author jkonicki
 */
public class UIM_NetworkElement extends com.harris.netboss.common.schema.generation.classes.UIM_PhysicalElement implements java.io.Serializable {


    private String IPAddress
 ;
    private Short ManagementStatus
  = new Short((short)0);
    private Long ManagedBy
 ;

    public UIM_NetworkElement() {


    }

   
    public String getIPAddress() {
        return this.IPAddress;
    }
    
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }
    public Short getManagementStatus() {
        return this.ManagementStatus;
    }
    
    public void setManagementStatus(Short ManagementStatus) {
        this.ManagementStatus = ManagementStatus;
    }
    public Long getManagedBy() {
        return this.ManagedBy;
    }
    
    public void setManagedBy(Long ManagedBy) {
        this.ManagedBy = ManagedBy;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("IPAddress").append("='").append(getIPAddress()).append("' ");			
      buffer.append("ManagementStatus").append("='").append(getManagementStatus()).append("' ");			
      buffer.append("ManagedBy").append("='").append(getManagedBy()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


