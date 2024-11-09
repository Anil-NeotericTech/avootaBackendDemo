package com.neoteric.avoota_application.errorStatus;

import lombok.Data;


public enum AccountStatusEnum {

    IN_VALID("Enter mobile number is not registered"),
    VALID("Entered mobile number is valid");
    private String label;
    AccountStatusEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
