package com.cool.likeSee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cool.likeSee.model.domain.UserTeam;
import com.cool.likeSee.service.UserTeamService;
import com.cool.likeSee.mapper.UserTeamMapper;
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




