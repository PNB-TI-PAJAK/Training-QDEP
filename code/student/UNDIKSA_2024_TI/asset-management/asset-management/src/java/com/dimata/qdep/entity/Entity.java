/* Generated by Together */

package com.dimata.qdep.entity;
import java.io.*;

public class Entity implements Serializable
{
    private long OID = 0;
    protected long[] alMultiOIDs = {0,0,0,0,0};

    public Entity(){    	
    }
    
    public long getOID(){
        return OID;
    }

    public void setOID(long OID){
    	this.OID = OID;
    }

    // -------------------------------- multiple ID
    public long getOID(int i){
        if(i> (alMultiOIDs.length-1))
            return -1;
        return alMultiOIDs[i];
    }
    
    public void setOID(int i, long OID){
        if(i > (alMultiOIDs.length-1))
            return;
        
        if(i == 0) 
            this.OID = OID;
        
        alMultiOIDs[i]=OID;
    } 
        
    public String getPstClassName() {
       return "";
    }
}
