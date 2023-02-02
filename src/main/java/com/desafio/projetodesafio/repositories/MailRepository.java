package com.desafio.projetodesafio.repositories;

import com.desafio.projetodesafio.models.MailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MailRepository extends JpaRepository<MailModel, UUID>{
}
