package com.agrsmrt.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class TaskTeamId implements Serializable {
    private static final long serialVersionUID = -3157215225336785963L;
    @NotNull
    @Column(name = "task_id", nullable = false)
    private Integer taskId;

    @NotNull
    @Column(name = "labourer_id", nullable = false)
    private Integer labourerId;


}