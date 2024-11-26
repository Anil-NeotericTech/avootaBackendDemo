package com.neoteric.avoota_application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MpinDTO {

    private String mobileNumber;
    private  String mpin;
}
