package com.example.demo.dao;

import com.example.demo.model.SysItem;

public interface SysItemMapper {
    int insert(SysItem record);

    int insertSelective(SysItem record);

    SysItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysItem record);

    int updateByPrimaryKey(SysItem record);
}