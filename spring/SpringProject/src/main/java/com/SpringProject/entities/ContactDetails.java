package com.SpringProject.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ContactDetails {
    private String email;
    private String phone;
    private String address;

}


