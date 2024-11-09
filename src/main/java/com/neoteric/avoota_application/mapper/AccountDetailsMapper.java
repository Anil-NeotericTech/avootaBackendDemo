package com.neoteric.avoota_application.mapper;

import com.neoteric.avoota_application.entity.AccountDetailsEntity;
import com.neoteric.avoota_application.model.AccountDetails;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component

public class AccountDetailsMapper {
@Autowired
    public ModelMapper modelMapper;

    public AccountDetailsEntity toEntity(AccountDetails accountDetails){

        return modelMapper.map(accountDetails,AccountDetailsEntity.class);

    }

    public AccountDetails toDto (AccountDetailsEntity accountDetailsEntity){

        return modelMapper.map(accountDetailsEntity,AccountDetails.class);

    }

//    public void updateEntityFromModel(AccountDetails model, AccountDetailsEntity entity) {
//        entity.setFullName(model.getFullName());
//        entity.setDateOfBirth(model.getDateOfBirth());
//        entity.setGender(model.getGender());
//        entity.setMaritalStatus(model.getMaritalStatus());
//        entity.setCity(model.getCity());
//        entity.setState(model.getState());
//        entity.setEmail(model.getEmail());
//
//    }

    public void updateEntityFromModel(AccountDetails model, AccountDetailsEntity entity) {
        modelMapper.map(model, entity);
    }

}








