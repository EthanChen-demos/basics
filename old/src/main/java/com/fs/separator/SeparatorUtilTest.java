package com.fs.separator;

import java.util.Properties;

public class SeparatorUtilTest {

    /* system properties to get separators */
    static final Properties PROPERTIES = new Properties(System.getProperties());

    /**
     * get line separator on current platform
     * @return line separator
     */
    public static String getLineSeparator(){
        return PROPERTIES.getProperty("line.separator");
    }

    /**
     * get path separator on current platform
     * @return path separator
     */
    public static String getPathSeparator(){
        return PROPERTIES.getProperty("path.separator");
    }
    
    public static void main (String[] args){
        System.out.println("Line separator is: " + getLineSeparator());
        System.out.println("Path separator is: " + getPathSeparator());
    }
}

