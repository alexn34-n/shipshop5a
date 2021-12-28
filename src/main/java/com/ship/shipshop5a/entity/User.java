package com.ship.shipshop5a.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="user",schema = "public")
public class User {
    @Id
    private UUID id;
    private String login;
    private  String password;
    private String role;
    private String name;
    private String lastName;
    private String secondName;
    private  String phone;
    private  String email;
    private String imo;
    private  String name_ship;
//    private  String namePortStart;
//    private  String namePortFinish;

    @PrePersist
    private  void init(){
        if(this.id==null){
            this.id=UUID.randomUUID();
        }
    }

    public UUID getId() {
        return id;
    }

    public User setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRole() {
        return role;
    }

    public User setRole(String role) {
        this.role = role;
        return this;
    }

    public String getName() {

        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public User setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getImo() {
        return imo;
    }

    public User setImo(String imo) {
       this. imo = imo;
        return this;
    }

    public String getName_ship() {
        return name_ship;
    }

    public User setName_ship(String name_ship) {
        this.name_ship = name_ship;
        return this;
    }

    //    public String getName_ship() {
//        return name_ship;
//    }
//
//    public User setName_ship(String name_ship) {
//        this.name_ship = name_ship;
//        return this;
//    }

    public String getFIO() {

        return String.format("%s %s %s",
                getLastName()!=null?getLastName():"",
                getName()!=null?getName():"",
                getSecondName()!=null?getSecondName():"");

    }
}
//