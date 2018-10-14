package com.chunyue.project.dao;

import com.chunyue.project.model.Answer;

public interface AnswerMapper {
    int deleteByPrimaryKey(Long aid);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Long aid);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);
}