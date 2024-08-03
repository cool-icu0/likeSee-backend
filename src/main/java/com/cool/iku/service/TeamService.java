package com.cool.iku.service;

import com.cool.iku.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cool.iku.model.domain.User;

/**
* @author Cool
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-08-03 21:37:02
*/
public interface TeamService extends IService<Team> {

    /**
     *   添加队伍
     * @param team
     * @param logininUser
     * @return
     */
    long addTeam(Team team, User logininUser);
}
