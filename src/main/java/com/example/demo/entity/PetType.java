package com.example.demo.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name="pet_type")
public class PetType {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String typeName;
    private String createdAt;
    private String updatedAt;
    private Boolean isActive;

}
