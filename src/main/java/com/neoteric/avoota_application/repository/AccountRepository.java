package com.neoteric.avoota_application.repository;

import com.neoteric.avoota_application.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity,String> {
    Optional<AccountEntity> findByMobileNumber(String mobileNumber);



}
