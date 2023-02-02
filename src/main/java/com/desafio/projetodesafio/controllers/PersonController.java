package com.desafio.projetodesafio.controllers;


import com.desafio.projetodesafio.models.PersonModel;
import com.desafio.projetodesafio.services.PersonService;
import org.hibernate.validator.constraints.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private EmailController emailController;

    @PostMapping("/persons")
    public PersonModel createPerson(@RequestBody PersonModel person) {
        PersonModel createdPerson = personService.createPerson(person);
        emailController.sendEmail(createdPerson);
        return createdPerson;
    }

    @PutMapping("/persons/{id}")
    public PersonModel updatePerson(@PathVariable UUID id, @RequestBody PersonModel person) {
        person.setId(id);
        return personService.updatePerson(person);
    }
}