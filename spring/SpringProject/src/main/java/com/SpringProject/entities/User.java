package com.SpringProject.entities;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "user_table")
public class User {
    @Id
    private int id;
    private String name;
    @Embedded
    private ContactDetails contactDetails;

}





