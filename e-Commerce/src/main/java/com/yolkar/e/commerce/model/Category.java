package com.yolkar.e.commerce.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_İd")
    private  int id;

    private String name;


}
