package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_ManagementInterface
 * 	@author jkonicki
 */
public class UIM_ManagementInterface extends com.harris.netboss.common.schema.generation.classes.UIM_ManagedElement implements java.io.Serializable {


    private String Name
 ;

    public UIM_ManagementInterface() {


    }

   
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("Name").append("='").append(getName()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


