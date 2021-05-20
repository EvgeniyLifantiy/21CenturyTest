package com.TestTask.DAO;

import java.util.Date;
import java.util.List;

import com.TestTask.Entity.Goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDAO extends CrudRepository<Goods, Long> {



}
