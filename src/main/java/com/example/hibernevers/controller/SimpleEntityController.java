package com.example.hibernevers.controller;

import com.example.hibernevers.domain.SimpleEntity;
import com.example.hibernevers.repo.SimpleEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/simple-entity")
public class SimpleEntityController {
    private final SimpleEntityRepository simpleEntityRepository;

    @GetMapping("/{id}")
    @Transactional
    public SimpleEntity getSimpleEntity(@PathVariable Long id) {
        return simpleEntityRepository.findById(id).orElse(null);
    }

    @PostMapping("/save")
    @Transactional
    public SimpleEntity save(@RequestBody SimpleEntity simpleEntity) {
        return simpleEntityRepository.save(simpleEntity);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        simpleEntityRepository.deleteById(id);
    }
}
