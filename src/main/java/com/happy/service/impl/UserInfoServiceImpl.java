package com.happy.service.impl;

import com.happy.dao.IUserInfoDAO;
import com.happy.entity.UserInfo;
import com.happy.service.IUserInfoService;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public class UserInfoServiceImpl implements IUserInfoService {
    private IUserInfoDAO userInfoDAO;

    public void add(UserInfo userInfo) {
        userInfoDAO.add(userInfo);
    }

    public List<UserInfo> findAllUserInfo() {
        return userInfoDAO.findAllUserInfo();
    }

    public IUserInfoDAO getUserInfoDAO() {
        return userInfoDAO;
    }

    public void setUserInfoDAO(IUserInfoDAO userInfoDAO) {
        this.userInfoDAO = userInfoDAO;
    }
}
