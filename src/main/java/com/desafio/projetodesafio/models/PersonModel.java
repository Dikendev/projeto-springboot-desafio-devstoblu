package com.desafio.projetodesafio.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.UUID;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "TB_PERSON")
public class PersonModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false,  unique = true, length = 130)
    private String name;

    @Column(nullable = false, length = 130)
    private  int age;

    @Column(nullable = false, unique = true, length = 130)
    private String email;

    @Column(nullable = false, length = 130)
    private String species;

    @Column(nullable = false, length = 130)
    private String power;

    @Column(nullable = false, length = 130)
    private String powerLevel;

    @Column(nullable = false, length = 130)
    private Date dateOfEntrance;

    @Column(nullable = false, length = 130)
    private Date dateOfExit;
}
