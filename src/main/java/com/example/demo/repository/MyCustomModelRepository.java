package com.example.demo.repository;

import java.util.List;

public interface MyCustomModelRepository<T> {
    List<T> searchAll(String fname, Class<T> entityClass);
}
