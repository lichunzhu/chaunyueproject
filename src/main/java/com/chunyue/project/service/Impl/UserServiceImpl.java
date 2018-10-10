package com.chunyue.project.service.Impl;

import com.chunyue.project.dao.UserDao;
import com.chunyue.project.model.User;
import com.chunyue.project.service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int addUser(User user) {
        userDao.add(user);
        return 0;
    }
}
