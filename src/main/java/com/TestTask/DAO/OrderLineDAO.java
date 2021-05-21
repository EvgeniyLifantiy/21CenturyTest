package com.TestTask.DAO;

import com.TestTask.Entity.OrderLine;
import org.springframework.data.repository.CrudRepository;

public interface OrderLineDAO extends CrudRepository<OrderLine,Long> {
}
