package com.TestTask.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OrderLine {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    private Goods goods;

    public OrderLine(Order order, Goods goods) {
        this.order = order;
        this.goods = goods;
    }
}
