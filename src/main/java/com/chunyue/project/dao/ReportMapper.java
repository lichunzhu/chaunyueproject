package com.chunyue.project.dao;

import com.chunyue.project.model.Report;

public interface ReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}