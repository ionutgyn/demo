package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Article {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private String name;
    @Column
    private Double price;
    @Column
    private String category;
    @Column
    private String imagePath;
    @Column
    private Integer discount;
    @Column
    private Boolean isNew;
}
