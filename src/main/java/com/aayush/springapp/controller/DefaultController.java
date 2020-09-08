/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aayush.springapp.controller;


import com.aayush.springapp.entity.Skill;
import com.aayush.springapp.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dell
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Autowired
    private SkillRepository skillRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("skills", 
                skillRepository.findAll());
        model.addAttribute("total",
                skillRepository.countSkill());
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Skill skill) {
        skillRepository.save(skill);
        return "redirect:/";
    }
}
