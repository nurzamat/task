package com.sago.task.services.impl;

import com.sago.task.domain.entities.Application;
import com.sago.task.repositories.ApplicationRepository;
import com.sago.task.services.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationRepository applicationRepository;
    private static final Logger logger = LoggerFactory.getLogger(ApplicationServiceImpl.class);

    @Autowired
    public void setApplicationRepository(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }

    @Override
    @Transactional
    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }
}
