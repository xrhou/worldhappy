package com.happy.service;

import com.happy.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public interface IUserInfoService {
    public void add(UserInfo userInfo);

    public List<UserInfo> findAllUserInfo();
}
