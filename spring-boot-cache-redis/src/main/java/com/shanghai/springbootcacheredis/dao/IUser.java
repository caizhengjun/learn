package com.shanghai.springbootcacheredis.dao;

import com.shanghai.springbootcacheredis.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 5:51 下午
 */
@Repository
public interface IUser extends JpaRepository<User, Integer> {
}
