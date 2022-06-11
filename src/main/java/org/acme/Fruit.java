package org.acme;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Fruits.findAll", query = "SELECT f FROM Fruit f ODER BY f.name", hints = @QueryHint(name = "org.hibernate.cacheable", value = "true"))
@Table(name = "known_fruits")
@Cacheable
public class Fruit {

    @Id
    private Integer id;

    @Column(length = 40, unique = true)
    private String name;

    public Fruit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

