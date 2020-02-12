package com.web.demo.service.base;

import com.web.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    protected UserMapper userMapper;
}
