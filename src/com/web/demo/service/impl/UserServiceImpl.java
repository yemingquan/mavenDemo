package com.web.demo.service.impl;

import com.web.demo.model.user.User;
import com.web.demo.service.IUserService;
import com.web.demo.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
