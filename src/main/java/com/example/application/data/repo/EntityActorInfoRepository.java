package com.example.application.data.repo;

import com.example.application.data.entity.EntityActorInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EntityActorInfoRepository extends JpaRepository<EntityActorInfo, Void>, JpaSpecificationExecutor<EntityActorInfo> {

}