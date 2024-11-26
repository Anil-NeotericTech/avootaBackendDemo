package com.neoteric.avoota_application.service;

import com.neoteric.avoota_application.entity.MpinEntity;
import com.neoteric.avoota_application.model.MpinDTO;
import com.neoteric.avoota_application.repository.MpinRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class MpinService {

    @Autowired
    private MpinRepository mpinRepository;

    private static final Logger logger = LoggerFactory.getLogger(MpinService.class);

    public MpinEntity createMpin (MpinDTO mpinDTO) {

        logger.info("Entering method: createMpin with mobileNumber: {}", mpinDTO.getMobileNumber());

        MpinEntity  existingUser = mpinRepository.findByMobileNumber(mpinDTO.getMobileNumber());

        logger.info("Existing user details: {}",existingUser);

        String hashedMpin = BCrypt.hashpw(mpinDTO.getMpin(), BCrypt.gensalt());

        existingUser.setHashedMpin(hashedMpin);

        MpinEntity savedMpinDetails=  mpinRepository.save(existingUser);

        logger.info("Exiting method: createMpin for mobileNumber: {}", mpinDTO.getMobileNumber());

        return savedMpinDetails;
    }

    public boolean validateMpin(MpinDTO mpinDTO) {

        logger.info("Entering method: validateMpin with mobileNumber: {}", mpinDTO.getMobileNumber());

        MpinEntity existingUser = mpinRepository.findByMobileNumber(mpinDTO.getMobileNumber());

        String storedHashedMpin = existingUser.getHashedMpin();

        boolean isValid= BCrypt.checkpw(mpinDTO.getMpin(), storedHashedMpin);

        logger.info("Exiting method: validateMpin with validation result: {}", isValid);

        return isValid;
    }


}










