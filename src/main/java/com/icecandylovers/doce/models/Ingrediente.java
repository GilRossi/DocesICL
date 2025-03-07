package com.icecandylovers.doce.models;

import com.icecandylovers.doce.enums.Medida;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Ingrediente implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    private Geladinho geladinho;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idIngrediente;

    @NotBlank
    private String nome;
    @NotNull
    private float qtd;
    @NotNull
    private Medida medida;

    public Geladinho getGeladinho() {
        return geladinho;
    }

    public void setGeladinho(Geladinho geladinho) {
        this.geladinho = geladinho;
    }

    public UUID getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(UUID idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }
}
