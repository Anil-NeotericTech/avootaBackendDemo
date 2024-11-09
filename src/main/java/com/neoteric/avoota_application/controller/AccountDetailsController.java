package com.neoteric.avoota_application.controller;

import com.neoteric.avoota_application.entity.AccountDetailsEntity;
import com.neoteric.avoota_application.model.AccountDetails;
import com.neoteric.avoota_application.service.AccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountDetailsController {

    @Autowired
    AccountDetailsService service;


    @PutMapping(value = "api/accountDetails",consumes = "application/json",produces = "application/json")

    public AccountDetailsEntity saveAccountDetails(@RequestHeader ("mobileNumber") String mobileNumber,
                                                   @RequestBody AccountDetails accountDetails){

        return  service.saveOrUpdateDetails(mobileNumber,accountDetails);


    }

}
