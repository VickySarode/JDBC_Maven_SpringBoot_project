package org.example.Controller;


import org.example.Service.StudentServiceImpl;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentServiceImpl service;


    @RequestMapping("/login")
    @ResponseBody
    void login(@RequestBody Student student){

        service.login(student);

    }
//    @PostMapping("/delete")
//    vo

}
