package org.acme;

import io.quarkus.logging.Log;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class FruitService {

    @Inject
    private EntityManager entityManager;

    @Transactional
    public Fruit saveFruit(Fruit fruit) {
        entityManager.persist(fruit);
        Log.info("Fruit entity saved");

        return entityManager.find(Fruit.class, fruit.getId());
    }
}
