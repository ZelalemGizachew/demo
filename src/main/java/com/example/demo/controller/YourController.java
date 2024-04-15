package com.example.demo.controller;

import com.example.demo.service.YourService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class YourController {

    private final YourService yourService;

    @GetMapping("/search")
    public List<?> search(@RequestParam("fname") String fname) {
        return yourService.search(fname);
    }
}