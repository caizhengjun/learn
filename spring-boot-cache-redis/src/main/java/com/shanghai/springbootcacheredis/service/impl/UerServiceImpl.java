package com.shanghai.springbootcacheredis.service.impl;

import com.shanghai.springbootcacheredis.bean.User;
import com.shanghai.springbootcacheredis.dao.IUser;
import com.shanghai.springbootcacheredis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 5:29 下午
 */
@Service
@CacheConfig(cacheNames = {"caizhengjun"})
public class UerServiceImpl implements IUserService {

    @Autowired
    private IUser user;

    @Override
    @Cacheable(cacheManager = "cacheManager", key = "'USER:'+#id", unless = "#result == null")
    public User getUser(Integer id) {
        return this.user.findById(id).get();
    }

    @Override
    @CachePut(cacheManager = "cacheManager", key = "'USER:'+#id", unless = "#result == null")
    public User updateUser(Integer id, User updateUser) {
        updateUser.setId(id);
        return this.user.save(updateUser);
    }

    @Override
    @CacheEvict(cacheManager = "cacheManager", key = "'USER:'+#id")
    public void deleteUser(Integer id) {
        this.user.deleteById(id);
    }
}
