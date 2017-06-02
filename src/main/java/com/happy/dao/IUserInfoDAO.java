package com.happy.dao;

import com.happy.entity.UserInfo;

import java.util.List;

/**
 * Created by houxiurong on 2017/6/2.
 */
public interface IUserInfoDAO {
    /**
     * @param info
     */
    void add(UserInfo info);

    List<UserInfo> findAllUserInfo();
}
