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

    @OneToOne
    @JoinTable(
            name = "order",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Order order;

    @OneToOne
            @JoinTable(
            name = "goods",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Goods goods;

    public OrderLine(Order order, Goods goods) {
        this.order = order;
        this.goods = goods;
    }
}
