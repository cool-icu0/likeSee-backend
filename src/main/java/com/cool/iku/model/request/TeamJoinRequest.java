package com.cool.iku.model.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 */
@Data
public class TeamJoinRequest implements Serializable {


    private static final long serialVersionUID = 9044653435909816448L;
    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
