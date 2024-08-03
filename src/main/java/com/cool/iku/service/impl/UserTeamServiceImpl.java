package com.cool.iku.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cool.iku.model.domain.UserTeam;
import com.cool.iku.service.UserTeamService;
import com.cool.iku.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author Cool
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-08-03 21:40:05
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




