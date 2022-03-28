package com.scotycode.OAuth2authorizationserver.entity;

import com.sun.xml.bind.v2.TODO;
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

    //TODO Dodaj role and permmission
    private String role;
    private boolean enabled = false;

}
