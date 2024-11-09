package com.neoteric.avoota_application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accountDetails",schema = "avoota")
public class AccountDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(name = "fullName")
private String fullName;

@Column(name = "dateOfBirth")
private Date dateOfBirth;

@Column(name = "gender")
private String gender;

@Column(name = "maritalStatus")
private String maritalStatus;

@Column(name = "mobileNumber")
private String mobileNumber;
@Column(name="city")
private String city;
@Column(name="state")
private String state;
@Column(name="email")
    private String email;
}
