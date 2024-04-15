package com.example.demo.service;

import com.example.demo.model.MyModel;
import com.example.demo.repository.MyModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class YourService {

    private final MyModelRepository myModelRepository;

    public List<?> search(String fname) {

        return myModelRepository.searchAll(fname, MyModel.class);
    }
}
