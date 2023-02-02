package com.desafio.projetodesafio.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "TB_MAIL")
public class MailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID emailId;
    @NotBlank
    @Email
    private String emailFrom;


    private String emailTo;


    private String subject;

    @   Column(columnDefinition = "TEXT")
    private String text;

    private LocalDateTime sendDateEmail;

    private StatusMail statusEmail;
}
