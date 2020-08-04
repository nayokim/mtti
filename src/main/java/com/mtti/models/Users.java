package com.mtti.models;


import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false, length = 100)
    private String username;

    @Column (nullable = false, length = 100)
    private String password;

    @Column (nullable = false, length = 100)
    private String email;

    public Users(){}

    public Users(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public Users(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
