package com.icecandylovers.doce.repositories;

import com.icecandylovers.doce.models.Geladinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface GeladinhoRepository extends CrudRepository<Geladinho, UUID> {
}
