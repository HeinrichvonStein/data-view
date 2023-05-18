package com.example.application.data.V0;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class EntityActorVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "actorId can not null")
    private Long actorId;

    @NotNull(message = "firstName can not null")
    private String firstName;

    @NotNull(message = "lastName can not null")
    private String lastName;

    @NotNull(message = "lastUpdate can not null")
    private Date lastUpdate;

}