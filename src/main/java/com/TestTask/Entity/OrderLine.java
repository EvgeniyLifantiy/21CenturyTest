package com.TestTask.Entity;

import javax.persistence.*;

@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Goods goods;
}
