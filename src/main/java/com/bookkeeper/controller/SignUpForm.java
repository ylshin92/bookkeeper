package com.bookkeeper.controller;

import com.bookkeeper.domain.user.Gender;
import com.bookkeeper.domain.user.UserType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class SignUpForm {

    private String email;

    private String password;

    private String re_password;

    private String name;

    private LocalDate birthdate;

    private Gender gender;

    private UserType userType;

}
