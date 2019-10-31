package com.harris.netboss.common.schema.generation.classes;
// Generated 30.10.2019 18:16:25 by Hibernate Tools 3.2.2.GA



/**
 * Generated Javadocs for UIM_AutonomousNetworkResourceInstantiationComponent
 * 	@author jkonicki
 */
public class UIM_AutonomousNetworkResourceInstantiationComponent extends com.harris.netboss.common.schema.generation.classes.UIM_NetworkResourceInstantiationComponent implements java.io.Serializable {


    private String UniqueName
 ;

    public UIM_AutonomousNetworkResourceInstantiationComponent() {


    }

   
    public String getUniqueName() {
        return this.UniqueName;
    }
    
    public void setUniqueName(String UniqueName) {
        this.UniqueName = UniqueName;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("UniqueName").append("='").append(getUniqueName()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


