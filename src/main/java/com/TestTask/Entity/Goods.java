package com.TestTask.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "GOODS")
@Setter
@Getter

@NoArgsConstructor
public class Goods {
    @Id
    @GeneratedValue
    @Column(name = "goods_id",nullable = false)
    private long id;

    private String name;

    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
