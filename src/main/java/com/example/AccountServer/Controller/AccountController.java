package com.example.AccountServer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

@GetMapping(value = "/test")
public String test()
{
return "Account Working";
}

}
