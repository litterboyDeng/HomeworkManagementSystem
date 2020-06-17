package com.example.controller;

import com.example.entry.ResultReturn;
import com.example.entry.Teacher;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/17 23:09
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/register")
    public ResultReturn register(@RequestBody Teacher teacher){
        return teacherService.register(teacher);
    }
}
