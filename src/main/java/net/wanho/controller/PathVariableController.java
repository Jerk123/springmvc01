package net.wanho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jerk on 2019/5/30.
 */
@Controller
public class PathVariableController {


//    获取路径中的参数
    @RequestMapping("pathVariable1/{id}/name/{age}")
    public String pathVariable1(@PathVariable Integer id,@PathVariable Integer age){
        System.out.println(id+"============="+age);
        return "hello";
    }
}
