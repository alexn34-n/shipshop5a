package com.ship.shipshop5a.trash;


import com.ship.shipshop5a.entity.Product;
import com.ship.shipshop5a.entity.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class Review {

    @Id
    private UUID id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    //private Boolean isApproved;

    private String text;

    public UUID getId() {
        return id;
    }

    public Review setId(UUID id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Review setUser(User user) {
        this.user = user;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public Review setProduct(Product product) {
        this.product = product;
        return this;
    }

    public String getText() {
        return text;
    }

    public Review setText(String text) {
        this.text = text;
        return this;
    }
}
