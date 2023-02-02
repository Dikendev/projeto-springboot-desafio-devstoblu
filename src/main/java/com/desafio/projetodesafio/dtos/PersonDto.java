package com.desafio.projetodesafio.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class PersonDto {

    @NotBlank
    private String name;
    @NotNull
    private  int age;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String species;
    @NotBlank
    private String power;
    @NotBlank
    private String powerLevel;
    @NotBlank
    private Date dateOfEntrance;
    @NotBlank
    private Date dateOfExit;
}

