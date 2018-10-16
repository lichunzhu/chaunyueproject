package com.chunyue.project.service.Interface;

import com.chunyue.project.model.UserInfo;

public interface UserInfoService {

    public UserInfo selectByPrimaryKey(String uid);
}
