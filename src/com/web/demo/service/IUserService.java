package com.web.demo.service;

import com.web.demo.model.user.User;
import com.web.demo.service.base.IBaseService;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
public interface IUserService extends IBaseService<User> {
    public User login(String username,String password);
}
