package com.web.demo.service.base;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
public interface IBaseService<T> {
     public T findById(Integer id);

    public T findByUUID(String uuid);

    public void deleteById(Integer id);

    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
