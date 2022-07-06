package com.example.jobSearch.models;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue
    long id;
    @Column(name="username", length=255, nullable=false)
    String username;
    @Column(name="phonenumber", length=50, nullable=false)
    Integer phonenumber;
    @Column(name="email", length=255, nullable=false)
    String email;
    @Column(name="password", length=255, nullable=false)
    String password;

    public Users(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(long id, String username, Integer phonenumber, String email, String password) {
        this.id = id;
        this.username = username;
        this.phonenumber = phonenumber;
        this.email = email;
        this.password = password;
    }
}
