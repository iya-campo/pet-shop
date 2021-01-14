package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="pet")
public class Pet {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    // EAGER -> retrieves all data when table is fetched.
    // LAZY -> retrieves specific data only, unless a getter is called.
    @OneToOne(fetch = FetchType.EAGER,
    cascade = CascadeType.ALL) // cascade is optional.
    @JoinColumn(name = "type", referencedColumnName = "id")
    private PetType type;

    private String name;
    private Integer gender;
    private String description;
    private String petImg;
    private String createdAt;
    private String updatedAt;
    private Boolean isActive;

}
