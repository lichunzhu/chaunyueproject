package com.chunyue.project.service.Impl;

import com.chunyue.project.dao.UserInfoMapper;
import com.chunyue.project.model.UserInfo;
import com.chunyue.project.service.Interface.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectByPrimaryKey(String uid) {
        return userInfoMapper.selectByPrimaryKey(uid);
    }
}
