package com.chunyue.project.dao;

import com.chunyue.project.model.Remarks;

public interface RemarksMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Remarks record);

    int insertSelective(Remarks record);

    Remarks selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Remarks record);

    int updateByPrimaryKey(Remarks record);
}