package net.wanho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Jerk on 2019/5/30.
 */
@Controller
public class StudentController {

    @RequestMapping("toStu")
    public String toStu() {
        return "student";
    }

    @RequestMapping(value = "student/{id}",method = RequestMethod.GET)
    public String getStudentById(@PathVariable Integer id, Map map) {
        /* modelAndView.addObject("msg","hello2");
        modelAndView.setViewName("hello");
        return modelAndView; 下面的两句话相当于这里的三句话*/
        map.put("msg","查询id为"+id+"的学生信息");
        return "hello";
    }
    @RequestMapping(value = "student/{id}",method = RequestMethod.POST)
    public String addStu(@PathVariable Integer id, Map map) {
        /* modelAndView.addObject("msg","hello2");
        modelAndView.setViewName("hello");
        return modelAndView; 下面的两句话相当于这里的三句话*/
        map.put("msg","添加id为"+id+"的学生信息");
        return "hello";
    }
    @RequestMapping(value = "student/{id}",method = RequestMethod.PUT)
    public String updateStu(@PathVariable Integer id, Map map) {
        /* modelAndView.addObject("msg","hello2");
        modelAndView.setViewName("hello");
        return modelAndView; 下面的两句话相当于这里的三句话*/
        map.put("msg","修改id为"+id+"的学生信息");
        return "hello";
    }
    @RequestMapping(value = "student/{id}",method = RequestMethod.DELETE)
    public String delStu(@PathVariable Integer id, Map map) {
        /* modelAndView.addObject("msg","hello2");
        modelAndView.setViewName("hello");
        return modelAndView; 下面的两句话相当于这里的三句话*/
        map.put("msg","删除id为"+id+"的学生信息");
        return "hello";
    }
}
