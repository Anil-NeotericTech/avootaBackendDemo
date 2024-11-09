package com.neoteric.avoota_application.mapper;

import com.neoteric.avoota_application.entity.AccountEntity;
import com.neoteric.avoota_application.model.Account;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {


    @Autowired

    private ModelMapper modelMapper;

    public AccountEntity toEntity(Account account){

        return modelMapper.map(account, AccountEntity.class);

    }

    public Account toDto(AccountEntity accountEntity){

        return modelMapper.map(accountEntity, Account.class);

    }

}
