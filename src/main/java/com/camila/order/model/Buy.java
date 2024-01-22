package com.camila.order.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String description;
}
