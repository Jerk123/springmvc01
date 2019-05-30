package net.wanho.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jerk on 2019/5/30.
 */
@org.springframework.stereotype.Controller("/hello")
public class HelloController implements Controller  {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        //相当于原来的request.setAttribute（"msg","hello"）
        modelAndView.addObject("msg","hello");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
