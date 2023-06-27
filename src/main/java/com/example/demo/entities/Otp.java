package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Otp {

    @Id
    private String username;
    private String code;
}
