package com.ship.shipshop5a.entity.repository;

import com.ship.shipshop5a.entity.Cart;
import com.ship.shipshop5a.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
    @Query("select c from Cart c where c.order is null")
    Optional<Cart> findCartByOrderIdIsNull();


    @Query("select c from Cart c where c.user=:user and c.order is null")
    Optional<Cart> findByUser(User user);
}
//