package com.ship.shipshop5a.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Product implements Serializable {

    @Id
    @GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name="name",nullable = false)
    private String name;

   @Column(name="category")
    private String category;


    @Column(name="count")
    private int count;

    @Column(name="price")
    private BigDecimal price;

  @Column(name="port_delivery")//
  private String port_delivery;


//    @Column(name="next_date")//
//   private Date next_date;

    @PrePersist
    private  void init(){
        if(this.id==null){
            this.id=UUID.randomUUID();
        }
    }

    public UUID getId() {
        return id;
    }

    public Product setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }



    public int getCount() {
        return count;
    }

    public Product setCount(int count) {
        this.count = count;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    //
    public String getCategory() {
        return category;
    }
    //
    public Product setCategory(String category) {
        this.category = category;
        return this;
    }
//
    public String getPort_delivery() {
        return port_delivery;
    }
//
    public Product setPort_delivery(String port_delivery) {
        this.port_delivery = port_delivery;
        return this;
    }
//
//    public Date getNext_date() {
//        return next_date;
//    }
////
//    public Product setNext_date(Date next_date) {
//        this.next_date = next_date;
//        return this;
//    }

    public void incrementCount(){
        this.count++;
    }
    public  void  decreaseCount(){
        this.count--;
    }
}

//



