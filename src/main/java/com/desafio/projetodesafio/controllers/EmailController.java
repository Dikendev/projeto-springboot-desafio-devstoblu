package com.desafio.projetodesafio.controllers;

import com.desafio.projetodesafio.models.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/mail")
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/send-email")
    public void sendEmail(@RequestBody PersonModel person) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(person.getEmail());
        if (person.getSpecies().equalsIgnoreCase("Homo sapiens") ||
                person.getSpecies().equalsIgnoreCase("Homo peregrino")) {
            message.setSubject("Alerta de entrada na mansão de mutantes");
            message.setText("Olá, você acaba de entrar na mansão de mutantes. Por favor, tenha cuidado.");
        } else if (person.getSpecies().equalsIgnoreCase("Homo superior")) {
            message.setSubject("Boas vindas à mansão de mutantes");
            message.setText("Olá, seja bem-vindo à mansão de mutantes. Esperamos que desfrute da sua estadia.");
        }
        javaMailSender.send(message);
    }
}
