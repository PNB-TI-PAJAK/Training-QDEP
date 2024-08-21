/* Generated by Together */


package com.dimata.gui.jsp;

import java.util.*;

import javax.servlet.http.*;


public class ControlRadio{
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        int x = 0;
        try {
            x = Integer.parseInt(tableWidth) / width;
        }
        catch (Exception e) {
            try {
                int lengthTemp = tableWidth.length();
                String tmp = tableWidth.substring(0, lengthTemp - 1);
                //System.out.println(tmp);
                x = Integer.parseInt(tmp) / width;
            }
            catch (Exception exc) {
                System.out.println("Hey.. we got an exception  =" + exc.toString());
            }
        }
        this.cellWidth = String.valueOf(x) + "%";
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCellSpace() {
        return cellSpace;
    }

    public void setCellSpace(String cellSpace) {
        this.cellSpace = cellSpace;
    }

    public String getTableAlign() {
        return tableAlign;
    }

    public void setTableAlign(String tableAlign) {
        this.tableAlign = tableAlign;
    }

    public String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getTableWidth() {
        return tableWidth;
    }

    public void setTableWidth(String tableWidth) {
        this.tableWidth = tableWidth;
    }

    public String getCellPad() {
        return cellPad;
    }

    public void setCellPad(String cellPad) {
        this.cellPad = cellPad;
    }

    public String getTableStyle() {
        return tableStyle;
    }

    public void setTableStyle(java.lang.String tableStyle) {
        this.tableStyle = tableStyle;
    }

    public String getInputStyle() {
        return inputStyle;
    }

    public void setInputStyle(String inputStyle) {
        this.inputStyle = inputStyle;
    }

    public String getCellStyle() {
        return cellStyle;
    }

    public void setCellStyle(String cellStyle) {
        this.cellStyle = cellStyle;
    }

    public String getCellWidth() {
        return cellWidth;
    }

    public void setCellWidth(String cellWidth) {
        this.cellWidth = cellWidth;
    }

    private int width;
    private int height;
    private String cellSpace;
    private String tableAlign;
    private String name;
    private String tableWidth;
    private String cellPad;
    private String tableStyle;
    private String inputStyle;
    private String cellStyle;
    private String cellWidth;


    /**
       Table Dimention :
     		-> rows, cols

		Radio Button :
        	-> name, value, caption, checked
     */
    //public static String draw(String name, String initVal, int size, int maxChar)
	public static String draw()
    {
        /*
        if(name == null) name = new String("txt_input");
        String sz = "";
        String mc = "";
          */

        int cols = 3;
        int rows = 4;

        String strHtml = "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n";

/*
		  <tr>
		    <td><input type="radio" name="radiobutton" value="radiobutton" checked> sdfdsf </td>
		    <td><input type="radio" name="radiobutton" value="radiobutton">sdfdsf </td>
		    <td><input type="radio" name="radiobutton" value="radiobutton">sdfdsf </td>
		  </tr>
*/
		for(int i = 0; i < rows; i++) {
            strHtml = strHtml + "  <tr>\n";
			for(int j = 0; j < cols; j++) {
            	strHtml = strHtml + "    <td><input type=\"radio\" name=\"radiobutton\" value=\"radiobutton\" checked>" + j + "</td>\n";
	        } // end for cols
			strHtml = strHtml + "  </tr>\n";
        } //end for rows

        return strHtml;
    } // end draw



    public static String getStr(String name, HttpServletRequest req) {
        String value = "";
        try {
	        value = req.getParameter(name);
        }catch(Exception e) {
        }
        return value;
    }
    
    public String draw(String name, Vector vctValue, Vector vctCaption, Vector vctChecked) {
        this.setName(name);
        if (vctCaption == null || vctCaption.size() <= 0) {
            System.out.println("Parameter error...");
            return null;
        }
        if (vctChecked == null) {
            System.out.println("Parameter error...");
            return null;
        } else {
            String str = new String("");
            str = "<table width=\"" + tableWidth + "\" cellSpacing=\"" + cellSpace + "\" cellPadding=\"" + cellPad +
                    "\" class=\"" + tableStyle + "\" align=\"" + tableAlign + "\">";
            int count = 0;
            if (width > vctValue.size())
                width = vctValue.size();
            int countRow = vctValue.size() / width;
            if (vctValue.size() % width > 0)
                countRow = countRow + 1;
            for (int i = 0; i < countRow; i++) {
                str = str + "<tr>";
                for (int a = 0; a < width; a++) {
                    str = str + "<td width=\"" + cellWidth + "\" class=\"" + cellStyle +
                            "\" nowrap><input type=\"radio\" name=\"" + name + "\" value=\"" + vctValue.get(count) +
                            "\" class=\"" + inputStyle + "\"";
                    for (int c = 0; c < vctChecked.size(); c++) {
                        if (vctValue.get(count).equals(vctChecked.get(c))) {
                            str = str + " checked";
                            break;
                        }
                    }
                    str = str + ">" + (String) vctCaption.get(count) + "</td>";
                    count++;
                    if (count >= vctValue.size())
                        break;
                }
                str = str + "</tr>";
            }
            str = str + "</table>";
            System.out.println(str);
            return str;
        }
    }
    

} // end of WP_ControlDate()
