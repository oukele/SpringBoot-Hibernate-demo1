package com.demo.student.controller;

import com.demo.student.entity.Student;
import com.demo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author OUKELE
 * @create 2019-04-14 17:24
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public Object list(){
        List<Student> list = studentService.listAll();
        if( list == null ) return "{\"msg\":\"无数据\"}";
        return studentService.listAll();
    }

    @PostMapping("/insert")
    public String insert(Student student){
        int save = studentService.save(student);
        if (save>0)return "{\"msg\":\"新增成功\"}";
        return "{\"msg\":\"新增失败\"}";
    }

    @PostMapping("/update")
    public String update(Student student){
        int save = studentService.save(student);
        if (save>0)return "{\"msg\":\"更新成功\"}";
        return "{\"msg\":\"更新失败\"}";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int stuId){
        int delete = studentService.delete(stuId);
        if(delete >0)return "{\"msg\":\"删除成功\"}";
        return "{\"msg\":\"删除失败\"}";
    }



}
