package com.sago.task.services;

import com.sago.task.domain.entities.Application;
import com.sago.task.domain.models.ApplicationFilter;

import java.util.List;

public interface ApplicationService {

    Application saveApplication(Application application);

    List<Application> getApplicationsByFilter(ApplicationFilter filter);
}
