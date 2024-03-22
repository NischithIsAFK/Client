package com.nis.Client.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    private long id;
    private  String name;
    private String type;
    private String password;
}
