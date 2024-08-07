package com.cool.likeSee.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamQuitRequest implements Serializable {
    private static final long serialVersionUID = -3272056370929757139L;
    /**
     * id
     */
    private Long teamId;
}