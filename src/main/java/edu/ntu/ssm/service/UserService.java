package edu.ntu.ssm.service;

import edu.ntu.ssm.po.User;

/**
 * 用户Service层接口
 */
public interface UserService {
	// 通过账号和密码查询用户UserServiceImpl.java
	public User findUser(String usercode, String password);
}
