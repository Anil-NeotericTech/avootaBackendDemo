package com.neoteric.avoota_application.repository;

import com.neoteric.avoota_application.entity.MpinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MpinRepository extends JpaRepository<MpinEntity,Long> {

    MpinEntity findByMobileNumber(String mobileNumber);

}
