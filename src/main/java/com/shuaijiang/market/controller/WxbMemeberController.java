package com.shuaijiang.market.controller;

import com.shuaijiang.market.service.UserService;
import com.shuaijiang.market.vo.JsonResult;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/memeber")
public class WxbMemeberController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public JsonResult login(String username, String password){
        try {
            userService.login(username,password);
            return new JsonResult(1,"登录成功");
        } catch (UnknownAccountException e1){
            e1.printStackTrace();
            return new JsonResult(2,"用户名和密码错误");
        } catch (AccountException e2) {
            e2.printStackTrace();
            return new JsonResult(2,"用户名和密码错误");
        } catch (Exception e3){
            e3.printStackTrace();
            return new JsonResult(3,"未知的错误");
        }
    }

//    /**
//     * 登录
//     * ResponseBody加上此注解，方法return的是什么，将不会做任何的处理和修饰，直接将返回的字符串给用户。
//     * @param loginMemeber
//     * @param session
//     * @return
//     */
//    @ResponseBody
//    @RequestMapping("/login2")
//    public JsonResult login2(LoginMemeber loginMemeber,HttpSession session){
//        JsonResult jsonResult = new JsonResult();
//        try {
//            WxbMemeber wxbMemeber = wxbMemeberService.findName(loginMemeber);
//            session.setAttribute("wxbMemeber",wxbMemeber);
//            jsonResult.setCode(1);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            jsonResult.setCode(0);
//            jsonResult.setMsg("请输入用户名");
//        } catch (NameNotFoundException | PasswordErrorException e){
//            e.printStackTrace();
//            jsonResult.setCode(0);
//            jsonResult.setMsg("用户名或者密码错误");
//        } catch (Exception e){
//            e.printStackTrace();
//            jsonResult.setCode(0);
//            jsonResult.setMsg("请联系管理员");
//        }
//        /*重定向不会经过视图解析器*/
//        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
//        return jsonResult;
//    }
}
