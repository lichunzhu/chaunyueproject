package com.chunyue.project.service.Impl;

import com.chunyue.project.dao.QuestionMapper;
import com.chunyue.project.model.Question;
import com.chunyue.project.service.Interface.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    @Override
    public Question selectByPrimaryKey(Long qid) {
        return questionMapper.selectByPrimaryKey(qid);
    }
}
