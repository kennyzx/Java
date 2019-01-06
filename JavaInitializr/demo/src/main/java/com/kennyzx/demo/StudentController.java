package com.kennyzx.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repository;
    
    @RequestMapping(value="/students", method=RequestMethod.GET)
    public List<Student> getAll(){
        return repository.findAll();
    }
}
