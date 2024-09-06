/* Generated by Together */

package com.dimata.util.blob;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ImageLoader {

    
    private SmartUpload smartUploader = new SmartUpload();
    private Hashtable hsFiles = new Hashtable(); 	// key -> html_field_name(String), val -> Object_of_byte[](Object array of bayte)
    
    
    public ImageLoader() { 
    }
    
 
    public int uploadImage(ServletConfig conf, HttpServletRequest req, HttpServletResponse res) {
        try {
            smartUploader.initialize(conf, req, res);
            smartUploader.upload();
            return composeImage();
        }catch(Exception e) {
            System.out.println("ImageLoader.upload() " + e.toString());
            return 0;
        }
    }


    public int uploadImage(String des, String nmFile) {
        try {
            //smartUploader.initialize(conf, req, res);
            smartUploader.uploadRename(des+""+nmFile);
            return composeImage();
        }catch(Exception e) {
            System.out.println("ImageLoader.upload() " + e.toString());
            return 0;
        }
    }
    
    public String getFileName() {
        try {
            com.dimata.util.blob.Files hsBlobFiles = smartUploader.getFiles();
            String fileName ="";
            for(int i = 0; i < hsBlobFiles.getCount(); i++) {
                com.dimata.util.blob.File upFile = hsBlobFiles.getFile(i);
                // getFileName
                 fileName = upFile.getFileName();
                
            } // end for;
            
            return fileName;
        } catch(Exception e){
            System.out.println("ImageLoader.composeImage() " + e.toString());
            return "";
        }
    }


    // get the real data from the http binary package
    private int composeImage() {
        try {
            com.dimata.util.blob.Files hsBlobFiles = smartUploader.getFiles();
            System.out.println("Number of uploaded file......>> " + hsBlobFiles.getCount());
            
            for(int i = 0; i < hsBlobFiles.getCount(); i++) {
                com.dimata.util.blob.File upFile = hsBlobFiles.getFile(i);
                
                // end/start index refer to http byte data
                // substract it, to find the real data index
                int fSize = upFile.getEndData() - upFile.getStartData();
                String type = upFile.getSubTypeMIME();
                

                byte[] realBytes = new byte[fSize + 1];
                for(int j = 0;  j < fSize; j++) {
                    realBytes[j] = upFile.getBinaryData(j);
                }

                // fieldName is the field name object contaiting
                // from html fo file to be uploaded from html
                // e.g. <input type="file" name="field_name" value="">
                // field_name is fieldName
                String key = upFile.getFieldName();
                Object obj = (Object) realBytes;

                hsFiles.put(key, obj); // put byte[] object
                
            } // end for;
            
            return 0;
        } catch(Exception e){
            System.out.println("ImageLoader.composeImage() " + e.toString());
            return -1;
        }
    }
    
    public Object getImage(String key) {
        return (Object)hsFiles.get(key);
    }    
    
    
    public static int deleteChace(String absolutePath) {        
        java.io.File flImg = new java.io.File(absolutePath);
        if(flImg.exists())
            flImg.delete();
        return 0;
    }    
    
 
    public static int writeCache(InputStream ins, String fileName, boolean replace) {
        System.out.println("img cache : " + fileName);
        if(ins == null) return -1;
        
        System.out.println("img cache : " + fileName);
        java.io.File fileImg = new java.io.File(fileName);
        if(replace) {
            if(fileImg.exists()) fileImg.delete();
        }else {
            if(fileImg.exists()) return 0;
        }
        
        try{
            int size = ins.available() + 1;
            byte[] b = new byte[size];
            
            int objSize = ins.read(b);
            if(objSize < 1) return -1;
            System.out.println("img cache......");
            FileOutputStream imgOut = null;
            imgOut = new FileOutputStream(fileImg);
            System.out.println("imgOut "+imgOut);
            imgOut.write(b);
             System.out.println("imgOut "+imgOut);
            return 0;
            
        }catch (Exception exc) {
            System.out.println("img cache exc : " + fileName);
            System.out.println("ImageLoader.writeCache() " + exc.toString());
        }
        return -1;
    }

} // end of ImageLoader
