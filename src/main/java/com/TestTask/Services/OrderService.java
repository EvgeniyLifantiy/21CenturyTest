package com.TestTask.Services;

import com.TestTask.DAO.OrderDAO;
import com.TestTask.Entity.Goods;
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

    public Order findById(int id){
        return orderDAO.findById((long) id).get();
    }

    public void addOrder(Order order){

        orderDAO.save(order);
    }
}
