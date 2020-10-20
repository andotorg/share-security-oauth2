# Share Security OAuth2

密码流程 
请求授权 -- 查询有appid -- 启动登录页面  --- 点击登录  -- 请求带有password 登录带有用户名和密码

-- 请求获取到token -- token里面就有用户信息 （没有第三方app的事情，都是一方）

请求授权 -- 查询有appid -- 启动登录页面  --- 点击授权登录  -- 用户登录，类型为浏览到authorization_code

-- 请求获取到code --- 跳转到重定向页面（也就是第三方app） --- 第三方app可以拿着这个code获取用户信息 （授权码适合有真正第三方）