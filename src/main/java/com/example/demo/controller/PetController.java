package com.example.demo.controller;

import com.example.demo.entity.Pet;
import com.example.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
public class PetController {

    private PetService petService;

    @Autowired
    public void setPetService(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/pet")
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/pet/{petId}")
    public Pet getPet(@PathVariable(value="petId") Integer petId) {
        return petService.getPet(petId);
    }

}
