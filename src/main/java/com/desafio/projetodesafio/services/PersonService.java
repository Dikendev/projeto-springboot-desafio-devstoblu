package com.desafio.projetodesafio.services;

import com.desafio.projetodesafio.models.PersonModel;
import com.desafio.projetodesafio.repositories.PersonRepository;
import org.hibernate.validator.constraints.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonModel createPerson(PersonModel person) {
        person.setDateOfEntrance(new Date());
        return personRepository.save(person);
    }

    public PersonModel updatePerson(PersonModel person) {
        return personRepository.save(person);
    }

    public List<PersonModel> getAllPersons() {
        return personRepository.findAll();
    }

    public PersonModel getPersonById(UUID id) {
        return personRepository.findById(id).orElse(null);
    }

    public void deletePerson(UUID id) {
        personRepository.deleteById(id);
    }

}
