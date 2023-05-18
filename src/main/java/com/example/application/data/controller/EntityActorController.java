package com.example.application.data.controller;

import com.example.application.data.DTO.EntityActorDTO;
import com.example.application.data.V0.EntityActorQueryVO;
import com.example.application.data.V0.EntityActorUpdateVO;
import com.example.application.data.V0.EntityActorVO;
import com.example.application.data.service.EntityActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/entityActor")
public class EntityActorController {

    @Autowired
    private EntityActorService entityActorService;

    @PostMapping
    public String save(@Valid @RequestBody EntityActorVO vO) {
        return entityActorService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") Long id) {
        entityActorService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") Long id,
                       @Valid @RequestBody EntityActorUpdateVO vO) {
        entityActorService.update(id, vO);
    }

    @GetMapping("/{id}")
    public EntityActorDTO getById(@Valid @NotNull @PathVariable("id") Long id) {
        return entityActorService.getById(id);
    }

    @GetMapping
    public Page<EntityActorDTO> query(@Valid EntityActorQueryVO vO) {
        return entityActorService.query(vO);
    }
}