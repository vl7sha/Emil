package com.example.emil.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book implements Serializable
{
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "count", nullable = false)
    private int count;

    @ManyToOne()
    @JoinColumn(name = "author")
    private User author;

    @Column(name = "date", nullable = false)
    private LocalDate date;

}
