package com.TestTask.Services;

import com.TestTask.DAO.GoodsDAO;
import com.TestTask.Entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    public GoodsService(GoodsDAO goodsDAO) {
        this.goodsDAO = goodsDAO;
    }


    GoodsDAO goodsDAO;

    public void addGoods(String name,int price){

        goodsDAO.save(new Goods(name,price));
    }
}
