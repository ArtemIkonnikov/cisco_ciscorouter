package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_GenericInterface
 * 	@author jkonicki
 */
public class UIM_GenericInterface extends com.harris.netboss.common.schema.generation.classes.UIM_Port implements java.io.Serializable {


    private String PhysicalAddress
 ;
    private Integer AdminStatus
 ;
    private Integer OperStatus
 ;
    private Integer Index
 ;
    private String InterfaceType
 ;
    private Integer DuplexMode
  = new java.lang.Integer(2);
    private Long Speed
 ;
    private Long HighSpeed
 ;
    private String Alias
 ;
    private Long Mtu
 ;
    private String IfKeyName
 ;
    private String InterfaceNameIfMib
 ;
    private String InterfaceDescriptionIfMib
 ;

    public UIM_GenericInterface() {


    }

   
    public String getPhysicalAddress() {
        return this.PhysicalAddress;
    }
    
    public void setPhysicalAddress(String PhysicalAddress) {
        this.PhysicalAddress = PhysicalAddress;
    }
    public Integer getAdminStatus() {
        return this.AdminStatus;
    }
    
    public void setAdminStatus(Integer AdminStatus) {
        this.AdminStatus = AdminStatus;
    }
    public Integer getOperStatus() {
        return this.OperStatus;
    }
    
    public void setOperStatus(Integer OperStatus) {
        this.OperStatus = OperStatus;
    }
    public Integer getIndex() {
        return this.Index;
    }
    
    public void setIndex(Integer Index) {
        this.Index = Index;
    }
    public String getInterfaceType() {
        return this.InterfaceType;
    }
    
    public void setInterfaceType(String InterfaceType) {
        this.InterfaceType = InterfaceType;
    }
    public Integer getDuplexMode() {
        return this.DuplexMode;
    }
    
    public void setDuplexMode(Integer DuplexMode) {
        this.DuplexMode = DuplexMode;
    }
    public Long getSpeed() {
        return this.Speed;
    }
    
    public void setSpeed(Long Speed) {
        this.Speed = Speed;
    }
    public Long getHighSpeed() {
        return this.HighSpeed;
    }
    
    public void setHighSpeed(Long HighSpeed) {
        this.HighSpeed = HighSpeed;
    }
    public String getAlias() {
        return this.Alias;
    }
    
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }
    public Long getMtu() {
        return this.Mtu;
    }
    
    public void setMtu(Long Mtu) {
        this.Mtu = Mtu;
    }
    public String getIfKeyName() {
        return this.IfKeyName;
    }
    
    public void setIfKeyName(String IfKeyName) {
        this.IfKeyName = IfKeyName;
    }
    public String getInterfaceNameIfMib() {
        return this.InterfaceNameIfMib;
    }
    
    public void setInterfaceNameIfMib(String InterfaceNameIfMib) {
        this.InterfaceNameIfMib = InterfaceNameIfMib;
    }
    public String getInterfaceDescriptionIfMib() {
        return this.InterfaceDescriptionIfMib;
    }
    
    public void setInterfaceDescriptionIfMib(String InterfaceDescriptionIfMib) {
        this.InterfaceDescriptionIfMib = InterfaceDescriptionIfMib;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("PhysicalAddress").append("='").append(getPhysicalAddress()).append("' ");			
      buffer.append("AdminStatus").append("='").append(getAdminStatus()).append("' ");			
      buffer.append("OperStatus").append("='").append(getOperStatus()).append("' ");			
      buffer.append("Index").append("='").append(getIndex()).append("' ");			
      buffer.append("InterfaceType").append("='").append(getInterfaceType()).append("' ");			
      buffer.append("DuplexMode").append("='").append(getDuplexMode()).append("' ");			
      buffer.append("Speed").append("='").append(getSpeed()).append("' ");			
      buffer.append("HighSpeed").append("='").append(getHighSpeed()).append("' ");			
      buffer.append("Alias").append("='").append(getAlias()).append("' ");			
      buffer.append("Mtu").append("='").append(getMtu()).append("' ");			
      buffer.append("IfKeyName").append("='").append(getIfKeyName()).append("' ");			
      buffer.append("InterfaceNameIfMib").append("='").append(getInterfaceNameIfMib()).append("' ");			
      buffer.append("InterfaceDescriptionIfMib").append("='").append(getInterfaceDescriptionIfMib()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


