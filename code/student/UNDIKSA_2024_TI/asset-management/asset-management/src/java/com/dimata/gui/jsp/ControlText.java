/* Generated by Together */


package com.dimata.gui.jsp;

import java.io.*;
import java.util.*;
import java.text.*;

import javax.servlet.http.*;

import com.dimata.util.*;

public class ControlText
{

    private static final String className = "\"elemenForm\"";

    public static String drawText(String name, String initVal, int size, int maxChar)
    {
        if(name == null) name = new String("txt_input");
        String sz = "";
        String mc = "";

        if(size > 0) sz = String.valueOf(size);
        if(maxChar > 0) mc = String.valueOf(maxChar);
        if(initVal == null)
			return "<input type=\"text\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+className+">\n";
        else
			return "<input type=\"text\" value=\"" + initVal + "\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+className+">\n";
    }

     public static String drawText(String name, String initVal, int size, int maxChar,String style)
    {
        if(name == null) name = new String("txt_input");
        String sz = "";
        String mc = "";

        if(size > 0) sz = String.valueOf(size);
        if(maxChar > 0) mc = String.valueOf(maxChar);
        if(initVal == null)
	        return "<input type=\"text\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+className+">\n";
        else
	        return "<input type=\"text\" value=\"" + initVal + "\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+className+">\n";
    }

     public static String drawTextWithStyle(String name, String initVal, int size, int maxChar,String style)
    {
        if(name == null) name = new String("txt_input");
        String sz = "";
        String mc = "";

        if(size > 0) sz = String.valueOf(size);
        if(maxChar > 0) mc = String.valueOf(maxChar);
        if(initVal == null)
	        return "<input type=\"text\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+style+">\n";
        else
	        return "<input type=\"text\" value=\"" + initVal + "\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+style+">\n";
    }



    public static String drawPassword(String name, String initVal, int size, int maxChar)
    {
        if(name == null) name = new String("pwtxt_input");
        String sz = "";
        String mc = "";

        if(size > 0) sz = String.valueOf(size);
        if(maxChar > 0) mc = String.valueOf(maxChar);
        if(initVal == null)
			return "<input type=\"password\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+className+">\n";
        else
			return "<input type=\"password\" value=\"" + initVal + "\" name=\"" + name + "\" size=\""+ sz +"\" maxlength=\""+ mc +"\" class="+className+">\n";
    }


    public static String drawLine(String name, String initVal, int col, int row)
    {
        if(name == null) name = new String("lntxt_input");
        String cl = "";
        String rw = "";

        if(col > 0) cl = String.valueOf(col);
        if(row > 0) rw = String.valueOf(row);
        //<textarea name="textfield" cols="12" rows="12"></textarea>
        if(initVal == null)
			return "<textarea name=\"" + name + "\" cols=\""+ cl +"\" rows=\""+ rw +"\" class="+className+">\n</textarea>";
        else
			return "<textarea  name=\"" + name + "\" cols=\""+ cl +"\" rows=\""+ rw +"\" class="+className+">\n"+ initVal +"</textarea>";
    }


    public static String getStr(String name, HttpServletRequest req) {
        String value = "";
        try {
	        value = req.getParameter(name);
        }catch(Exception e) {
        }
        return value;
    }

} // end of WP_ControlDate()
