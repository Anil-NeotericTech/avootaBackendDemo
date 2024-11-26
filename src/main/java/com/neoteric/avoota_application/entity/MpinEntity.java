package com.neoteric.avoota_application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mpin",schema = "avoota")
public class MpinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "hashedMpin")
    private String hashedMpin;

}
