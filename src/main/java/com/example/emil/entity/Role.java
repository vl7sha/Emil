package com.example.emil.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity(name = "role")
@Table(name = "roles")
public class Role implements Serializable {
    @Id
    @Column(name = "name", nullable = false)
    private String name;


}
