package com.TestTask.Services;

import com.TestTask.DAO.OrderDAO;
import com.TestTask.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
@Service
public class OrderService {

    @Autowired
    public OrderService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    private OrderDAO orderDAO;

    public void addOrder(String name,String adress){

        orderDAO.save(new Order(name,new Date(),adress));
    }
}
