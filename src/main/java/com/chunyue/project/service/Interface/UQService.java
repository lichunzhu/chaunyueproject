package com.chunyue.project.service.Interface;

import com.chunyue.project.model.UQ;

import java.util.List;

public interface UQService {
    public List<UQ> getQuestionsByUserId(String uid);
}
