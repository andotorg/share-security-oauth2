package org.andot.share.sharesecurityoauth2.util;

public class CodeUtil {
    public static String get(String appid, String scope){
        String str = appid + scope + System.currentTimeMillis();
        return SHA1Util.encode(str);
    }
}
