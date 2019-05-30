package net.wanho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jerk on 2019/5/30.
 */
@Controller
public class ParamController {

    @RequestMapping("toParam")
    public String toParam() {
        return "requestParam";
    }

//参数名相同
    @RequestMapping("requestParam1")
    public String requestParam1( Integer id){
        System.out.println(id);
        return "hello";
    }

//参数名不同，需要手动指定
    @RequestMapping("requestParam2")
    public String requestParam2(@RequestParam("id") Integer name){
        System.out.println(name);
        return "hello";
    }

    //参数名相同，参数名必须要有required = true
    @RequestMapping("requestParam3")
    public String requestParam3(@RequestParam(required = true) Integer id){
        System.out.println(id);
        return "hello";
    }

    //默认值  如果有参数传过来，使用传过来的参数赋值，如果没有，用默认值
    @RequestMapping("requestParam4")
    public String requestParam4(@RequestParam(required = false,defaultValue = "1") Integer pageNum){
        System.out.println(pageNum);
        return "hello";
    }

    //多个参数
    @RequestMapping("requestParam5")
    public String requestParam5(Integer id,Integer age){
        System.out.println(id+"=========="+age);
        return "hello";
    }


}
