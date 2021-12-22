package com.ship.shipshop5a.entity.repository;


import com.ship.shipshop5a.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends CrudRepository<Order, UUID> {

}

//