package com.icecandylovers.doce.repositories;

import com.icecandylovers.doce.models.Ingrediente;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IngredienteRepository extends CrudRepository<Ingrediente, UUID> {
}
