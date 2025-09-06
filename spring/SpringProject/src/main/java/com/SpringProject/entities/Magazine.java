package com.SpringProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Magazine extends Item{
    private String year_published;
    private int sheetNo;
}