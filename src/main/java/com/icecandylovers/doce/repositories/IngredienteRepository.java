package com.icecandylovers.doce.repositories;

import com.icecandylovers.doce.models.Geladinho;
import com.icecandylovers.doce.models.Ingrediente;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IngredienteRepository extends CrudRepository<Ingrediente, UUID> {
    // Altere de "findByGelinho" para "findByGeladinho"
    Iterable<Ingrediente> findByGeladinho(Geladinho geladinho);
}
