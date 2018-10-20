package com.chunyue.project.service.Impl;


import com.chunyue.project.dao.UQMapper;
import com.chunyue.project.model.UQ;
import com.chunyue.project.service.Interface.UQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UQServiceImpl implements UQService {
    @Autowired
    UQMapper uqMapper;

    @Override
    public List<UQ> getQuestionsByUserId(String uid) {
        return uqMapper.selectByUserId(uid);
    }
}
