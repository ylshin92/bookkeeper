package com.bookkeeper.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private LocalDate birthdate;

    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender; //female, male

    @Column
    @Enumerated(EnumType.STRING)
    private UserType userType; //admin, user

    @Column
    private LocalDateTime reg_dt;

    @Column
    private LocalDateTime update_dt;

    @Column
    private LocalDateTime delete_dt;

}
