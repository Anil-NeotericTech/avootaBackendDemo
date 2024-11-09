package com.neoteric.avoota_application.service;

import com.neoteric.avoota_application.entity.AccountDetailsEntity;
import com.neoteric.avoota_application.entity.AccountEntity;
import com.neoteric.avoota_application.errorStatus.AccountStatusEnum;
import com.neoteric.avoota_application.mapper.AccountDetailsMapper;
import com.neoteric.avoota_application.model.AccountDetails;
import com.neoteric.avoota_application.repository.AccountDetailsRepo;
import com.neoteric.avoota_application.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class AccountDetailsService {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AccountDetailsRepo accountDetailsRepo;

    @Autowired
    AccountDetailsMapper accountDetailsMapper;

    public AccountDetailsEntity saveOrUpdateDetails(String mobileNumber, AccountDetails accountDetails) {
        Optional<AccountEntity> existingLoginDetails = accountRepository.findByMobileNumber(mobileNumber);

        if (existingLoginDetails.isPresent()) {
            Optional<AccountDetailsEntity> existingDetails = accountDetailsRepo.findByMobileNumber(mobileNumber);

            if (existingDetails.isPresent()) {

                AccountDetailsEntity updatedDetails = existingDetails.get();
                accountDetailsMapper.updateEntityFromModel(accountDetails, updatedDetails);
                updatedDetails.setMobileNumber(mobileNumber);
                return accountDetailsRepo.save(updatedDetails);
            } else {

                AccountDetailsEntity saveDetails = accountDetailsMapper.toEntity(accountDetails);
                saveDetails.setMobileNumber(mobileNumber);
                return accountDetailsRepo.save(saveDetails);
            }
        } else {
            throw new RuntimeException(AccountStatusEnum.IN_VALID.getLabel());
        }
    }


}