package com.sago.task.repositories;

import com.sago.task.domain.entities.Attribute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends CrudRepository<Attribute, Integer> {

}