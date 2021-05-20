package com.TestTask.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchase")// "order" reserved by h2
public class Order {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id=1l;

    private String client;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String address;

}

