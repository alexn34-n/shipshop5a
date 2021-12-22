package com.ship.shipshop5a.entity.repository;

import com.ship.shipshop5a.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    Optional<User> findByLogin(String login);
    List<User> findAll();
}
//