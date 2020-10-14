package org.andot.share.sharesecurityoauth2.endpoint;

import org.andot.share.sharesecurityoauth2.req.AccessTokenResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucas
 * @date 2020-10-13
 */
@RequestMapping("/sns/oauth2/access_token")
@RestController
public class AccessTokenEndpoint {
    /**
     * appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
     *
     * @param appid 应用的唯一标识
     * @param secret 应用的appsecret
     * @param code 填写第一步获取的code参数
     * @param grant_type 填写为authorization_code
     */
    @GetMapping("")
    public AccessTokenResponse accessToken(String appid, String secret, String code, String grant_type){


        return new AccessTokenResponse("ACCESS_TOKEN", 7200L, "", "", "");
    }
}
