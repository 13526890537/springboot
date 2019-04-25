package com.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import domin.Student;
import domin.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import java.util.List;

/**
 * 用户控制器
 *
 * @author zym
 * @create 2018-06-19 14:27
 **/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Reference(version = "1.0.0")
    private StudentService studentService;



    @GetMapping("getStudent")
    public Student student() {
        return studentService.findStudent();
    }

    @GetMapping("getAllStudent")
    public List<Student> allStudent() {
        return studentService.findAllStudent();
    }
}
