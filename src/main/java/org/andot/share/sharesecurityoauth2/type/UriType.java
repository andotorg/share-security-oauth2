package org.andot.share.sharesecurityoauth2.type;

public class UriType {
    /**
     * 请求认证服务器之后，跳转的链接地址
     * after request authorize server， redirect uri address
     */
    public static final String REDIRECT_URI_PARAM = "/?code=%s&state=%s";
    public static final String SESSION_AUTH_REDIRECT_URL = "session_auth_redirect_url";
}
