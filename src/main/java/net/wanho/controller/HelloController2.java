package net.wanho.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jerk on 2019/5/30.
 */
@Controller
public class HelloController2  {

    @RequestMapping(value = "hello2",method = RequestMethod.GET)
//    @GetMapping("hello2")
    public ModelAndView hello(ModelAndView modelAndView) {
        modelAndView.addObject("msg","hello2");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping(value = "hello3",method = RequestMethod.POST)
//    @PostMapping("hello3")
    public ModelAndView hello3(ModelAndView modelAndView) {
        modelAndView.addObject("msg","hello3");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping("hello4")
//    @RequestMapping("/user/*/hello4")
//    @RequestMapping("/user/**/hello4")
    public ModelAndView hello4(ModelAndView modelAndView) {
        modelAndView.addObject("msg","hello4");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
