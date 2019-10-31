package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_ManagedSystemElement
 * 	@author jkonicki
 */
public class UIM_ManagedSystemElement extends com.harris.netboss.common.schema.generation.classes.UIM_ManagedElement implements java.io.Serializable {


    private String GeoCoordinates
 ;
    private Boolean GeoInherited
  = new java.lang.Boolean(true);
    private String ElementType
 ;
    private String Name
 ;
    private Integer[] OperationalStatus
  = new java.lang.Integer[]{new java.lang.Integer(0)};
    private Boolean MaintenanceOutageAllowed
  = new java.lang.Boolean(true);
    private Long SystemId
 ;

    public UIM_ManagedSystemElement() {


    }

   
    public String getGeoCoordinates() {
        return this.GeoCoordinates;
    }
    
    public void setGeoCoordinates(String GeoCoordinates) {
        this.GeoCoordinates = GeoCoordinates;
    }
    public Boolean getGeoInherited() {
        return this.GeoInherited;
    }
    
    public void setGeoInherited(Boolean GeoInherited) {
        this.GeoInherited = GeoInherited;
    }
    public String getElementType() {
        return this.ElementType;
    }
    
    public void setElementType(String ElementType) {
        this.ElementType = ElementType;
    }
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    public Integer[] getOperationalStatus() {
        return this.OperationalStatus;
    }
    
    public void setOperationalStatus(Integer[] OperationalStatus) {
        this.OperationalStatus = OperationalStatus;
    }
    public Boolean getMaintenanceOutageAllowed() {
        return this.MaintenanceOutageAllowed;
    }
    
    public void setMaintenanceOutageAllowed(Boolean MaintenanceOutageAllowed) {
        this.MaintenanceOutageAllowed = MaintenanceOutageAllowed;
    }
    public Long getSystemId() {
        return this.SystemId;
    }
    
    public void setSystemId(Long SystemId) {
        this.SystemId = SystemId;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("GeoCoordinates").append("='").append(getGeoCoordinates()).append("' ");			
      buffer.append("GeoInherited").append("='").append(getGeoInherited()).append("' ");			
      buffer.append("ElementType").append("='").append(getElementType()).append("' ");			
      buffer.append("Name").append("='").append(getName()).append("' ");			
      buffer.append("MaintenanceOutageAllowed").append("='").append(getMaintenanceOutageAllowed()).append("' ");			
      buffer.append("SystemId").append("='").append(getSystemId()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


