package com.neoteric.avoota_application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account",schema = "avoota")
public class AccountEntity {

    @Id
    @Column(name = "mobileNumber",nullable = false)
    private String mobileNumber;


}
