package com.web.demo.model.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private int id;
    private String username;
    private String password;
}
