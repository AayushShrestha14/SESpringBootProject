/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aayush.springapp.controller;

import com.aayush.springapp.entity.Skill;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dell
 */
@RestController
@RequestMapping(value="/api/hello")
public class HelloController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String hello(){
        return "Hello World!";        
    }
    
    @RequestMapping(value="/skill",method = RequestMethod.GET)
    public Skill skill(){
        return new Skill(1,"Programming");
    }
    
    @RequestMapping(value="/skills",method = RequestMethod.GET)
    public List<Skill> skills(){
        List<Skill> skills=new ArrayList<>();
        skills.add(new Skill(1,"Programming"));
        skills.add(new Skill(2,"Designing"));
        skills.add(new Skill(3,"Testing"));
        return skills;
    }
    
    @RequestMapping(value="/s",method=RequestMethod.GET)
    public ResponseEntity<Skill> s(){
        return ResponseEntity.ok(new Skill(1, "Front End"));
    }
}
