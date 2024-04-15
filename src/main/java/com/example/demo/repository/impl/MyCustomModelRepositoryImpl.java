package com.example.demo.repository.impl;


import com.example.demo.repository.MyCustomModelRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;


@Repository
@Transactional(readOnly = true)
public class MyCustomModelRepositoryImpl<T> implements MyCustomModelRepository<T> {

    private final EntityManager entityManager;

    public MyCustomModelRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<T> searchAll(String fname, Class<T> entityClass) {
        return Collections.emptyList();
    }
}
