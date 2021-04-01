package com.sago.task.repositories;

import com.sago.task.domain.entities.Application;
import com.sago.task.domain.models.ApplicationFilter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
@Transactional(readOnly = true)
public class ApplicationRepositoryCustomImpl implements ApplicationRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Application> getApplicationsByFilter(ApplicationFilter filter) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Application> cq = cb.createQuery(Application.class);
        //todo joins
        Root<Application> applicationRoot = cq.from(Application.class);
        List<Predicate> predicates = new ArrayList<>();
        if (filter.getPositionId() != null) {
            predicates.add(cb.equal(applicationRoot.get("position_id"), filter.getPositionId()));
        }
        if (filter.getFirstName() != null) {
            predicates.add(cb.equal(applicationRoot.get("first_name"), filter.getFirstName()));
        }
        if (filter.getLastName() != null) {
            predicates.add(cb.equal(applicationRoot.get("last_name"), filter.getLastName()));
        }
        if (filter.getEmail() != null) {
            predicates.add(cb.equal(applicationRoot.get("email"), filter.getEmail()));
        }
        if(filter.getAttributes() != null){
            for(Map.Entry<String, String> currentEntry : filter.getAttributes().entrySet())
            {
                predicates.add(cb.equal(applicationRoot.get(currentEntry.getKey()), currentEntry.getValue()));
            }
        }
        cq.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(cq).getResultList();
    }
}
