package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Double x;
    Double y;
    String description;
    @ManyToOne
    BuildingType buildingType;
}
