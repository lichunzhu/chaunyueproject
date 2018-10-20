package com.chunyue.project.service.Interface;

import com.chunyue.project.model.Question;

public interface QuestionService {
    Question selectByPrimaryKey(Long qid);
}
