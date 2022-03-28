package com.scotycode.springsecurityclient.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;


    @Column(unique = true)
    private String email;


    @Column(length = 60)
    private String password;


    private String role;
    private boolean enabled = false;
}
