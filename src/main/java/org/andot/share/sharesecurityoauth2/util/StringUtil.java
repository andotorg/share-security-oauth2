package org.andot.share.sharesecurityoauth2.util;

public class StringUtil {
    private StringUtil () {}

    public static boolean isEmpty(String str){
        if(str == null || str.equals("") || str.length() == 0){
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str){
        if(str != null && !str.equals("") && str.length() != 0){
            return true;
        }
        return false;
    }
}
