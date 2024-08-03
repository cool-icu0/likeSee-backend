package com.cool.iku.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cool.iku.model.domain.Team;
import com.cool.iku.service.TeamService;
import com.cool.iku.mapper.TeamMapper;
import org.springframework.stereotype.Service;

/**
* @author Cool
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2024-08-03 21:37:02
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService{

}




