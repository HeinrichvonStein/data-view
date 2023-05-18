package com.example.application.data.V0;


import java.io.Serializable;
import java.util.Date;

@lombok.Data
public class EntityActorQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long actorId;

    private String firstName;

    private String lastName;

    private Date lastUpdate;

}