package com.example.AccountServer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    Environment env;

    @Value("${spring.application.profile}")
    String profile;

    @GetMapping(value = "/user-test")
    public String test() {
        return "Account, User Working on Port: " + env.getProperty("local.server.port") + ", profile: " + profile;
    }
}
