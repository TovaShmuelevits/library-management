package com.SpringProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book extends Item{
    private String author;
    @Enumerated(EnumType.ORDINAL)
    private Category category;
}
