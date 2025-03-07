package com.icecandylovers.doce.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Geladinho implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idGelinho;

    @NotBlank
    private String sabor;
    @NotNull
    @Positive
    private Integer qtd;
    @NotNull
    private LocalDate fab;
    private LocalDate val;

    @OneToMany
    private List<Ingrediente> ingredientes;

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public UUID getIdGelinho() {
        return idGelinho;
    }

    public void setIdGelinho(UUID idGelinho) {
        this.idGelinho = idGelinho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public LocalDate getFab() {
        return fab;
    }

    public void setFab(LocalDate fab) {
        this.fab = fab;
    }

    public LocalDate getVal() {
        return val;
    }

    public void setVal(LocalDate val) {
        this.val = val;
    }
}
