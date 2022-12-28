package com.kolosovvlad.betsesports.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "messages")
public class Registration {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
