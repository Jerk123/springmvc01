package net.wanho.controller;

import net.wanho.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Jerk on 2019/5/30.
 */
@Controller
public class UserController {

    @RequestMapping("toUser")
    public String toUser() {
        return "user";
    }

    @RequestMapping("addUser")
    public String requestParam5(User user){
        System.out.println(user.getUsername()+"=========="+user.getAge());
        return "hello";
    }

    @RequestMapping("servlet")
    public String servlet(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        return "hello";
    }

}
