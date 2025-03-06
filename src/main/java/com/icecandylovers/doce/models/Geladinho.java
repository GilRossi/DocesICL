package com.icecandylovers.doce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Geladinho implements Serializable {
    private static final long serialVERSIONUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idGelinho;

    private String sabor;
    private int qtd;
    private LocalDateTime fab;
    private Date val;

}
