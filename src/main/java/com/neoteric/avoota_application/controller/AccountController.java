package com.neoteric.avoota_application.controller;


import com.neoteric.avoota_application.model.Account;
import com.neoteric.avoota_application.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AccountController {
    @Autowired
    AccountService service;

    @PostMapping(value = "api/login",consumes = "application/json",produces = "application/json")

    public String saveLoginDetails(@RequestBody Account account){
        return service.saveMobileNumber(account);
    }




}
