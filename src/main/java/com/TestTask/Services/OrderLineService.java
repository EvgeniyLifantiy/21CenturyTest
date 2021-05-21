package com.TestTask.Services;

import com.TestTask.DAO.OrderLineDAO;
import com.TestTask.Entity.Goods;
import com.TestTask.Entity.Order;
import com.TestTask.Entity.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderLineService {

    @Autowired
    public OrderLineService(OrderLineDAO orderLineDAO) {
        this.orderLineDAO = orderLineDAO;
    }

    private OrderLineDAO orderLineDAO;

    public void add(OrderLine orderLine){
        orderLineDAO.save(orderLine);
        orderLineDAO.save(orderLine);
    }
}
