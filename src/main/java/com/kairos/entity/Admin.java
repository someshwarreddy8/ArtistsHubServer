package com.kairos.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Admin extends MetaDataEntity {

    private String userName;
    private String password;
    private String confirmPassword;
    private String email;
    private String mobile;

}
