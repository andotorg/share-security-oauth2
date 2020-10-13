package org.andot.share.sharesecurityoauth2.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * access token response object
 * @author lucas
 * @date 2020-10-13 23:33:08
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccessTokenResponse extends Response {
    /**
     * 网页授权接口调用凭证
     */
    private String accessToken;
    /**
     * access_token接口调用凭证超时时间，单位（秒）
     */
    private Long expiresIn;
    /**
     * 用户刷新access_token
     */
    private String refreshToken;
    /**
     * 用户唯一标识
     */
    private String openid;
    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    private String scope;
}
