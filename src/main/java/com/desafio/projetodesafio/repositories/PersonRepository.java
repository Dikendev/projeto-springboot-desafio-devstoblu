package com.desafio.projetodesafio.repositories;

import com.desafio.projetodesafio.models.PersonModel;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, UUID> {
}
