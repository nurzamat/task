package com.sago.task.repositories;

import com.sago.task.domain.entities.CustomerFeatureValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerFeatureValueRepository extends CrudRepository<CustomerFeatureValue, Long> {

}