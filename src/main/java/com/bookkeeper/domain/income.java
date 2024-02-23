package com.bookkeeper.domain;

import com.bookkeeper.domain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "income_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "user_id")
    private User user;

    @Column
    private String detail_income_id;

    @Column
    private LocalDateTime income_dt;

    @Column
    private int income_amount;

    @Column
    private LocalDateTime reg_dt;

    @Column
    private LocalDateTime update_dt;

    @Column
    private LocalDateTime delete_dt;


}
