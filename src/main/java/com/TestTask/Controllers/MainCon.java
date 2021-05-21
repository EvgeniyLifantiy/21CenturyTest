package com.TestTask.Controllers;

import com.TestTask.Entity.Order;
import com.TestTask.Services.GoodsService;
import com.TestTask.Services.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.TestTask.DAO.OrderDAO;

import java.util.Date;

@RestController
public class MainCon {

    @Autowired
    private OrderService orderService;
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/Add")
    public String Add(){
        goodsService.addGoods("12",12);
        orderService.addOrder("Евгений","Пушкинская 18");
        return "Add";
    }

}
