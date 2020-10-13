package org.andot.share.sharesecurityoauth2.endpoint;

import org.andot.share.sharesecurityoauth2.exception.NotFoundCodeException;
import org.andot.share.sharesecurityoauth2.exception.NotFoundSharpException;
import org.andot.share.sharesecurityoauth2.type.UriType;
import org.andot.share.sharesecurityoauth2.util.CodeUtil;
import org.andot.share.sharesecurityoauth2.util.StringUtil;
import org.andot.share.sharesecurityoauth2.util.UUIDUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucas
 * @date 2020-10-13
 */
@RestController
@RequestMapping("/connect/oauth2/authorize")
public class AuthorizeEndpoint {

    /**
     * #share_redirect
     * @param appid 应用的唯一标识 anf0e81c3bee622d60  an + 16 位随机数
     * @param redirect_uri 授权后重定向的回调链接地址， 请使用 urlEncode 对链接进行处理
     * @param response_type 返回类型，请填写code
     * @param scope 应用授权作用域，snsapi_base （不弹出授权页面，直接跳转，只能获取用户openid），snsapi_userinfo （弹出授权页面，可通过openid拿到昵称、性别、所在地。并且， 即使在未关注的情况下，只要用户授权，也能获取其信息 ）
     * @param state 重定向后会带上state参数，开发者可以填写a-zA-Z0-9的参数值，最多128字节
     * @param #share_redirect 无论直接打开还是做页面302重定向时候，必须带此参数
     */
    @GetMapping("")
    public void authorize (String appid,
                           String redirect_uri,
                           String response_type,
                           String scope,
                           String state,
                           HttpServletRequest request,
                           HttpServletResponse response) throws Exception {

        /*String url = request.getContextPath();

        if (state.indexOf("#") == -1) {
            throw new NotFoundSharpException("请在后面带上固定的[#share_redirect]");
        }

        String endSharp = state.split("#")[1];
        if (StringUtil.isEmpty(endSharp) || !endSharp.equals("share_redirect")) {
            throw new NotFoundSharpException("请在后面带上固定的[#share_redirect]");
        }*/

        if (!response_type.equals("code")) {
            throw new NotFoundCodeException("response_type 值请填写 [code]");
        }

        if (!scope.equals("snsapi_base") && !scope.equals("snsapi_userinfo") ) {
            throw new NotFoundCodeException("scope 值只有[snsapi_base、snsapi_userinfo]可供选择！ ");
        }

        if (StringUtil.isEmpty(redirect_uri)) {
            throw new NotFoundCodeException("redirect_uri 值不能为空！ ");
        }

        String authorizationCode = CodeUtil.get(appid, scope);

        response.sendRedirect(redirect_uri +
                String.format(UriType.REDIRECT_URI_PARAM, authorizationCode, state));
    }
}
