package com.TestTask.Services;

import com.TestTask.Entity.Goods;
import com.TestTask.Entity.Order;
import com.TestTask.Entity.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EntityCreateService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private OrderLineService orderLineService;

    public void add(){
        /*
        In entity installed GeneratedValue Id. Now we create entities and get their unique id
         */
        Goods goods=new Goods("Молоко",15);
        Order order=new Order("Евгений",new Date(),"Пушкинская 18");
        OrderLine orderLine=new OrderLine(order,goods);


        goodsService.addGoods(goods);
        orderService.addOrder(order);
        orderLineService.add(orderLine);
    }

}
