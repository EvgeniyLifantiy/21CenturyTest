package com.TestTask.DAO;

import com.TestTask.Entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderDAO extends CrudRepository<Order, Long> {
}
