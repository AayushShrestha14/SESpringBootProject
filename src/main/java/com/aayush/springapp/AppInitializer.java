package com.aayush.springapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
@EnableAutoConfiguration
@SpringBootApplication
public class AppInitializer {
    public static void main(String[] args){
        SpringApplication.run(AppInitializer.class, args);
    }
}
