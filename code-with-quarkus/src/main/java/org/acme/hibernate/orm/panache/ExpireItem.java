package org.acme.hibernate.orm.panache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
public class ExpireItem extends PanacheEntity{

    @Column(length = 40)
    public String name;

    @Column(nullable = false)
    public String expireDate;

}