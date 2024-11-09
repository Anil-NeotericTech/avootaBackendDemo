package com.neoteric.avoota_application.service;

import com.neoteric.avoota_application.entity.AccountEntity;
import com.neoteric.avoota_application.mapper.AccountMapper;
import com.neoteric.avoota_application.model.Account;
import com.neoteric.avoota_application.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;


    @Autowired
    AccountMapper accountMapper;

    public String saveMobileNumber(Account account){


        AccountEntity details= accountMapper.toEntity(account);


        AccountEntity savedDetails = accountRepository.save(details);



        return savedDetails.getMobileNumber();


    }

}
