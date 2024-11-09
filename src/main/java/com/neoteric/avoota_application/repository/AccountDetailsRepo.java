package com.neoteric.avoota_application.repository;

import com.neoteric.avoota_application.entity.AccountDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountDetailsRepo extends JpaRepository<AccountDetailsEntity ,Long>{
    Optional<AccountDetailsEntity> findByMobileNumber(String mobileNumber);
}
