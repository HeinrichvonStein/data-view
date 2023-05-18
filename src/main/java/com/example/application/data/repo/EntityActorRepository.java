package com.example.application.data.repo;

import com.example.application.data.entity.EntityActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EntityActorRepository extends JpaRepository<EntityActor, Long> {
    long countDistinctByFirstName(String firstName);

}