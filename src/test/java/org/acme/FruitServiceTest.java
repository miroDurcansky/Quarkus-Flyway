package org.acme;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class FruitServiceTest {

    @Inject
    FruitService fruitService;

    @Test
    public void saveFruit(){
        Fruit fruit = new Fruit();
        fruit.setId(2);
        fruit.setName("Banana");

        Fruit savedFruit = fruitService.saveFruit(fruit);

        assertEquals("Banana", savedFruit.getName());
        assertEquals(2, savedFruit.getId());

    }
}

