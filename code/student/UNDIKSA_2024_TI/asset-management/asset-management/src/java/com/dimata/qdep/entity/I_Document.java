/* Generated by Together */

package com.dimata.qdep.entity;

public interface I_Document {

    /**
    * this method used to get number/code of 'document'
    * return String of number/document code
	*/                                                       
    //public String getDocumentNumber(long documentId);

    /**
    * this method used to get status of 'document'
    * return int of currentDocumentStatus
	*/                                                       
    public int getDocumentStatus(long documentId);

    /**
    * this method used to set status of 'document'
    * return int of currentDocumentStatus
	*/                                                       
    public int setDocumentStatus(long documentId, int indexStatus);

}
