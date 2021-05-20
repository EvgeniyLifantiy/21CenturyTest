package com.TestTask.Entity;

import javax.persistence.*;

@Entity
@Table(name = "GOODS")
public class Goods {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String price;
}
