package com.sago.task.repositories;

import com.sago.task.domain.entities.ApplicationAttributeValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationAttributeValueRepository extends CrudRepository<ApplicationAttributeValue, Long> {

}