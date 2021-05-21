package com.TestTask.Controllers;

import com.TestTask.Entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.TestTask.DAO.OrderDAO;

@Controller
public class MainCon {

    private OrderDAO orderDAO;

    @RequestMapping("/asdf")
    public void cf(){
        orderDAO.save(new Order());
    }
}
