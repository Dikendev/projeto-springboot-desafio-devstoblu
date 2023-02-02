package com.desafio.projetodesafio.services;

import com.desafio.projetodesafio.models.MailModel;
import com.desafio.projetodesafio.repositories.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService {

    @Autowired
    MailRepository mailRepository;

    public List<MailModel> findAll() {
        return mailRepository.findAll();
    }

    public MailModel save(MailModel mailModel) {
        return  mailRepository.save(mailModel);
    }
}

