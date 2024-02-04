package com.cool.iku.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cool.iku.model.domain.Tag;
import com.cool.iku.service.TagService;
import com.cool.iku.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author Cool
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-02-04 11:47:25
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




