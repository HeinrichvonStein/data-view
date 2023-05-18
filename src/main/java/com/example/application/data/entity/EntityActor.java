package com.example.application.data.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "actor", schema = "public")
public class EntityActor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "actor_id", nullable = false)
    private Long actorId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public Long getActorId() {
        return this.actorId;
    }
}