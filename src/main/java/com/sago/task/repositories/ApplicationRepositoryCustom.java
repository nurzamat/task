package com.sago.task.repositories;

import com.sago.task.domain.entities.Application;
import com.sago.task.domain.models.ApplicationFilter;

import java.util.List;


public interface ApplicationRepositoryCustom {

    List<Application> getApplicationsByFilter(ApplicationFilter filter);
}