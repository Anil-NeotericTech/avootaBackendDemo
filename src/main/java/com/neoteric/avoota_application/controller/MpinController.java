package com.neoteric.avoota_application.controller;

import com.neoteric.avoota_application.entity.MpinEntity;
import com.neoteric.avoota_application.model.MpinDTO;
import com.neoteric.avoota_application.service.MpinService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/avoota")

public class MpinController {

    @Autowired
    MpinService mpinService;
    @PostMapping("/create-mpin")
    public MpinEntity createMpin(@Valid @RequestBody MpinDTO mpinDTO) {

        return mpinService.createMpin(mpinDTO);

    }

    @PostMapping("/validate-mpin")

      public ResponseEntity<String> validateMpin(@Valid @RequestBody MpinDTO mpinDTO){

        boolean  isValid= mpinService.validateMpin(mpinDTO);

        if (isValid) {
            return ResponseEntity.ok("MPIN validated successfully.");
        } else {
            return ResponseEntity.status(400).body("Invalid MPIN.");
        }
      }

}
