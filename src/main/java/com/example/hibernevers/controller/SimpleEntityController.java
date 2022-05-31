package com.example.hibernevers.controller;

import com.example.hibernevers.domain.SimpleEntity;
import com.example.hibernevers.repo.SimpleEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/simple-entity")
public class SimpleEntityController {
    private final SimpleEntityRepository simpleEntityRepository;

    @PostMapping("/save")
    public SimpleEntity save(@RequestBody SimpleEntity simpleEntity) {
        return simpleEntityRepository.save(simpleEntity);
    }
}
