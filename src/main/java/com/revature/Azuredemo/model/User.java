package com.revature.Azuredemo.model;


import javax.persistence.*;


@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId")
    private Integer id;

    @Column
    private String myFirstName;

    @Column
    private String myLastName;


    public User() {
    }

    public User(String myFirstName, String myLastName) {
        this.myFirstName = myFirstName;
        this.myLastName = myLastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMyFirstName() {
        return myFirstName;
    }

    public void setMyFirstName(String myFirstName) {
        this.myFirstName = myFirstName;
    }

    public String getMyLastName() {
        return myLastName;
    }

    public void setMyLastName(String myLastName) {
        this.myLastName = myLastName;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"firstName\":\"" + myFirstName+ '\"' +
                ", \"lastName\":\"" + myLastName + '\"' +
                '}';
    }

}
