package com.shanghai.springbootcacheredis.service;

import com.shanghai.springbootcacheredis.bean.User;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 5:28 下午
 */
public interface IUserService {
    User getUser(Integer id);

    User updateUser(Integer id, User user);

    void deleteUser(Integer id);
}
