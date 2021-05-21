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
@AllArgsConstructor
@NoArgsConstructor
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

