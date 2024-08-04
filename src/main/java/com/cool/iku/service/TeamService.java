package com.cool.iku.service;

import com.cool.iku.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cool.iku.model.domain.User;
import com.cool.iku.model.dto.TeamQuery;
import com.cool.iku.model.request.TeamJoinRequest;
import com.cool.iku.model.request.TeamQuitRequest;
import com.cool.iku.model.request.TeamUpdateRequest;
import com.cool.iku.model.vo.TeamUserVO;

import java.util.List;

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

    /**
     * 搜索队伍
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);
    /**
     * 更新队伍
     * @param team
     * @param logininUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest team, User logininUser);
    /**
     * 加入队伍
     * @param teamJoinRequest
     * @param logininUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User logininUser);
    /**
     * 退出队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);
    /**
     * 解散队伍
     * @param id
     * @param logininUser
     * @return
     */
    boolean deleteTeam(long id, User logininUser);
}
