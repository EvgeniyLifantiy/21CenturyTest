package com.TestTask.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchase")// "order" reserved by h2
@Setter
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id",nullable = false)
    private Long id=1l;

    private String client;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String address;

    public Order(String client, Date dateOfBirth, String address) {
        this.client = client;
        this.date = dateOfBirth;
        this.address = address;
    }
}

