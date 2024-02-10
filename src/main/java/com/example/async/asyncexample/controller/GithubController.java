package com.example.async.asyncexample.controller;

import com.example.async.asyncexample.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {

    @Autowired
    GithubService emailService;
    @GetMapping("/send-email")
    public void sendEmail() {
        emailService.sendEmail();
    }
}
