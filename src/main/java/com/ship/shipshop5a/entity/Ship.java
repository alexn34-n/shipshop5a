package com.ship.shipshop5a.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Ship implements Serializable {
    @Id
    @GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name="imo",nullable = false)
    private String imo;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="portStart",nullable = false)
    private String portStart;

    @Column(name="portFinish",nullable = false)
    private String portFinish;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortStart() {
        return portStart;
    }

    public void setPortStart(String portStart) {
        this.portStart = portStart;
    }

    public String getPortFinish() {
        return portFinish;
    }

    public void setPortFinish(String portFinish) {
        this.portFinish = portFinish;
    }
}
////