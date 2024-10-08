/* Generated by Together */

package com.dimata.util;

public class Message {
    
    public static final int NONE             = -1;
    public static final int OK               = 0;
    public static final int UNKNOWN          = 1;
    public static final int NOT_FOUND        = 2;
    public static final int ALREADY_EXISTS   = 3;
    public static final int PROCESS_FAIL     = 4;
    public static final int PARAM_LACK       = 5;
    
    
    public static final int USERPWD_TOO_SHORT  	= 8;
    public static final int USERPWD_TOO_LONG 	= 9;
    public static final int RETYPEPWD_NOT_SYNCH = 10;
    public static final int INVALID_ENTRY_FORMAT 		= 11;
    public static final int FIELD_REQUIRED 		= 12;
    
    public static final int INVALID_LOGIN_ID  = 13;
    public static final int INVALID_PASSWORD  = 14;
    public static final int INVALID_AUTH_EMAIL  = 15;
    
    public static final int ALREADY_LOGIN  	= 16;
    public static final int LOGIN_SUCCESS  	= 17;
    public static final int LOGIN_FAILD  	= 18;
    public static final int LOGIN_CLOSED	= 19;
    
    public static final int DATA_INVALID	= 20;
    public static final int CANNOT_ADD_DATA	= 21;
    public static final int CANNOT_ADD_MORE_DATA = 22;
    
    public static final int SELLCODE_ALREADY_EXIST 	= 23;
    public static final int SELLTITLE_ALREADY_EXIST = 24;
    public static final int SELLCODE_TO_SHORT 		= 25;
    public static final int SELLACTIVITY_NULL		= 26;
    
    public static final int SELLHOTEL_SELLING_NULL   = 27;
    public static final int SELMEALS_SELLING_NULL    = 28;
    public static final int SELLTRANSPORT_SELLING_NULL =29;
    public static final int SELLGUIDEFEE_SELLING_NULL  =30;
    public static final int SELLDRIVERFEE_SELLING_NULL =31;
    
    public static final int SELLHOTEL_NET_NULL         =32;
    public static final int SELMEALS_NET_NULL          =33;
    public static final int SELLTRANSPORT_NET_NULL     =34;
    public static final int SELLGUIDEFEE_NET_NULL      =35;
    public static final int SELLDRIVERFEE_NET_NULL     =36;
    
    public static final int SELLHOTEL_SELLING_FORMAT         =37;
    public static final int SELMEALS_SELLING_FORMAT          =38;
    public static final int SELLTRANSPORT_SELLING_FORMAT =39;
    public static final int SELLGUIDEFEE_SELLING_FORMAT  =40;
    public static final int SELLDRIVERFEE_SELLING_FORMAT =41;
    
    public static final int SELLHOTEL_NET_FORMAT         =42;
    public static final int SELMEALS_NET_FORMAT          =43;
    public static final int SELLTRANSPORT_NET_FORMAT     =44;
    public static final int SELLGUIDEFEE_NET_FORMAT     =45;
    public static final int SELLDRIVERFEE_NET_FORMAT     =46;
    
    public static final int SELLENTRANCE_SELLING_FORMAT  	=47;
    public static final int SELLINSURANCE_SELLING_FORMAT    =48;
    public static final int SELLOTHER_SELLING_FORMAT        =49;
    public static final int SELLENTRANCE_NET_FORMAT         =50;
    public static final int SELLINSURANCE_NET_FORMAT        =51;
    public static final int SELLOTHER_NET_FORMAT            =52;
    
    public static final int SELLGUIDE_NULL			=53;
    public static final int SELLCOST_SELLING_NULL	=54;
    public static final int SELLCOST_NET_NULL		=55;
    public static final int DATA_BIGGER_ZERO	    =56;
    public static final int SELLSURCHARGE_ERR		=57;
    public static final int SELLCOMPULSORY_ERR		=58;
    public static final int DATE_FORMAT_ERR			=59;
    
    public static final int ADULT_RATE_NOT_FOUND	=60;
    public static final int CHILD_RATE_NOT_FOUND	=61;
    
    public static final int INVALID_NUMBER	=62;
    
    // UPLOAD FILE
    public static final int FILE_TYPE_ERR	= 101;
    public static final int FILE_SIZE_ERR	= 102;
    public static final int FILE_DIMENSION_ERR	= 103;
    
    
    // SECURITY MESSAGE
    public static final int SEC_NO_ACCESS_PRIV	= 120;
    //--- reserve -- 10 number : 120 -130
    
    
    
    // LOGIN MESSAGE
    // public static final int ALREADY_LOGIN  	= 16;
    // public static final int LOGIN_SUCCESS  	= 17;
    // public static final int LOGIN_FAILD  	= 18;
    // public static final int LOGIN_CLOSED		= 19;
    
    // INVALID LOGIN MESSAGE
        /*
      - not active
      - closed
      - invalid failure
      - incorect passwd/loginname
         */
    public static final int LOGIN_INVALID	= 131;
    public static final int LOGIN_INVALID_USRPWD	= 132;
    public static final int LOGIN_ALREADY_LOGIN	= 133;
    public static final int LOGIN_UNAPPROVED	= 134;
    public static final int LOGIN_INVALID_ACTCODE	= 135;
    //--- reserve --  : 131 -140
    
    
    public static final String[] errMessages={
        /* 0  */ "Ok", "Unknown Error", "Not found", "Object already exists",
        /* 4  */ "Process failed", "Parameter in correct/lacked", "Object not found",
                /* 7  */ "User already exist", "Login ID or Password too short", "Login ID or Password too long",
                /* 10 */ "Passwords does not match", "Invalid entry format", "Field required",
                
        /* 13 */ "Invalid Login ID", "Invalid Password", "Invalid Authentication Email",
        /* 16 */ "User is already login" ,"Login authorized" ,"Login faild", "Login closed",
        
        /* 20 */ "Invalid Data", "Can't add data", "Can't add more data",
        
        /* 23 */ "Code already exist", "Title already exist", "Code to short", "Activity Included Required",
        /* 27 */ "HotelRoom Selling Required", "Meals Selling Required", "Transport Selling Required",
        "GuideFee Selling Required", "DriverFee Selling Required",
        /* 32 */ "HotelRoom Net Required", "Meals Net Required", "Transport Net Required",
        "GuideFee Net Required", "DriverFee Net Required",
        /* 37 */ "Invalid Format Hotel Selling", "Invalid Format Meals Selling", "Invalid Format Transport Selling",
        "Invalid Format GuideFee Selling", "Invalid Format DeriverFee Selling",
        /* 42 */ "Invalid Format Hotel Net", "Invalid Format Meals Net", "Invalid Format Transport Net",
        "Invalid Format GuideFee Net", "Invalid Format DriverFee Net",
        "Invalid Format Entrance Selling", "Invalid Format Insurance Selling", "Invalid Format Other Selling",
        "Invalid Format Entrance Net", "Invalid Format Insurance Net", "Invalid Format Other Net",
        "Guide Available Required","Cost Selling Required","Cost Net Required","Field required",
        "Surcharge data can't null/zero & format must in Integer","Compulsory data can't null/zero & format must in Integer",
        "Date can't null & check your input format (dd/mm/yy)",
        /* 60 */ "No Selling Rate for Adult Num.", "No Selling Rate for Child Num.", "Number required","","","","","","","","",
                /* 71 */ "", "","","","","","","","","",
                /* 81 */ "", "","","","","","","","","",
                /* 91 */ "", "","","","","","","","","",
                /* 101*/ "Invalid file type", "File too large","Invalid image dimension","","","","","","","",
        /* 111*/ "","","","","","","","","",
        /* 120*/ "You have not enough access privilege","","","","","","","","","","",
        /* 131*/ "Invalid Login", "Invalid Login Id or Password", "User is already login","Unapproved user","Invalid activation code","","","","",""
    };
    
    
    
    public static String getErrorMsg(int idx) {
        if ( (idx>-1) && (idx < errMessages.length))
            return errMessages[idx];
        else
            return new String("");
    }
    
}
