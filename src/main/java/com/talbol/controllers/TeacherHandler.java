package com.talbol.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherHandler {

    @RequestMapping("/upload")
    public String uploadVideo() {
        return "Done";
    }

    @RequestMapping("/find/students")
    public void findChildren() {

    }

    @RequestMapping("/automatic/split")
    public void automaticallySplit() {

    }

}