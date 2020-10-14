package org.andot.share.sharesecurityoauth2.util;

import java.util.UUID;

public class UUIDUtil {
    private UUIDUtil () {}

    /**
     *
     * @param length
     * @return
     */
    public static String random (int length) {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        return uuid.substring(0, length);
    }
}
