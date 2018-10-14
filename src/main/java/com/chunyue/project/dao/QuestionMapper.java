package com.chunyue.project.dao;

import com.chunyue.project.model.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(Long qid);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Long qid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}