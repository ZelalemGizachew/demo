package com.example.demo.repository;

import com.example.demo.model.MyModel;
import org.springframework.stereotype.Repository;

@Repository
public interface MyModelRepository extends MyCustomModelRepository<MyModel> {

}
