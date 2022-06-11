package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class FruitService {

    @Inject
    private EntityManager entityManager;

    @Transactional
    public Fruit saveFruit(Fruit fruit) {
        entityManager.persist(fruit);

        return entityManager.find(Fruit.class, 2);
    }
}
