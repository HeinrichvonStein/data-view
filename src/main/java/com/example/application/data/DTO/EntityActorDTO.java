package com.example.application.data.DTO;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EntityActorDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long actorId;

    private String firstName;

    private String lastName;

    private Date lastUpdate;

}