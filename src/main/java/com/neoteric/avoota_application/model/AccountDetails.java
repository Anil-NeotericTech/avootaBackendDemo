package com.neoteric.avoota_application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AccountDetails {
    private String fullName;
    private Date dateOfBirth;
    private String gender;
    private String maritalStatus;
    private String mobileNumber;
    private String city;
    private String state;
    private String email;
}
