package com.example.application.data.service;

import com.example.application.data.DTO.EntityActorDTO;
import com.example.application.data.V0.EntityActorQueryVO;
import com.example.application.data.V0.EntityActorUpdateVO;
import com.example.application.data.V0.EntityActorVO;
import com.example.application.data.entity.EntityActor;
import com.example.application.data.repo.EntityActorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EntityActorService {

    @Autowired
    private EntityActorRepository entityActorRepository;

    public Long save(EntityActorVO vO) {
        EntityActor bean = new EntityActor();
        BeanUtils.copyProperties(vO, bean);
        bean = entityActorRepository.save(bean);
        return bean.getActorId();
    }

    public void delete(Long id) {
        entityActorRepository.deleteById(id);
    }

    public void update(Long id, EntityActorUpdateVO vO) {
        EntityActor bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        entityActorRepository.save(bean);
    }

    public EntityActorDTO getById(Long id) {
        EntityActor original = requireOne(id);
        return toDTO(original);
    }

    public Page<EntityActorDTO> query(EntityActorQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private EntityActorDTO toDTO(EntityActor original) {
        EntityActorDTO bean = new EntityActorDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private EntityActor requireOne(Long id) {
        return entityActorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}