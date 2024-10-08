/* Generated by Together */

package com.dimata.util;

public class Command 
{

    public static final int NONE    		= 0;  
    public static final int LIST    		= 1;  
    public static final int ADD     		= 2;  
    public static final int EDIT    		= 3;  
    public static final int SAVE    		= 4;  
    public static final int UPDATE    		= 5;  
    public static final int DELETE    		= 6;  
    public static final int REFRESH 		= 7;  
    public static final int VIEW	        = 8;
    public static final int POST       		= 9;
    public static final int GET       		= 10;    
    
    public static final int SUBMIT	     	= 11;  
    public static final int RESET               = 12;
    public static final int DETAIL     		= 13; 
    public static final int BACK  		= 14; 
    
    
    public static final int PREV                = 21; 
    public static final int NEXT     		= 22; 
    public static final int FIRST     		= 23; 
    public static final int LAST     		= 24; 
    public static final int GOTO     		= 25; 
    
    public static final int SEARCH     		= 31; 
    public static final int LOGIN     		= 32;
    public static final int LOGOUT     		= 33;
    public static final int LOAD     		= 34;
        

    public static final int CONFIRM     	= 41;  
    public static final int RECONFIRM  		= 42;
    public static final int ASSIGN    		= 43;
    public static final int APPROVE    		= 44;    
    public static final int CLOSE     		= 45;
    public static final int ACTIVATE   		= 46;    
    public static final int PRINT     		= 47;

        
    public static final int START	        = 51;
    public static final int STOP	        = 52;
    public static final int LOCK	        = 53;
    public static final int UNLOCK	        = 54;
    
    
    public static final int YES                 = 61;
    public static final int NO                  = 62;
    public static final int OK                  = 63;
    public static final int CANCEL              = 64;    
    public static final int RETRY               = 65;
    
    
    public static final int ASK                 = 71;

    public static final int POSTING                 = 72;

    public static final int REPOSTING                 = 73;

     public static final int ADDALL                 = 74;
     
     public static final int SAVEALL                 = 75;
     
     public static final int DELETEALL                 = 76;
     
    public static String commandString[] = {
        "None", "List", "Add", "Edit", "Save", "Update", "Delete", "Refresh", "View", "Post", "Get",
        "Submit", "Reset", "Detail", "Back",
        "Previous", "Next", "First", "Last", "Goto",
        "Search", "Login", "Logout", "Load",
        "Confirm", "Reconfirm", "Assign", "Approve", "Close", "Active", "Print",
        "Start", "Stop", "Lock", "Unlock",
        "Yes", "No", "Ok", "Cancel", "Retry",
        "Ask","Posting","Reposting","Add All","Save All","Delete All"
    };
}
