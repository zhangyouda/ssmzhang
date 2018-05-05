package com.zyd.mapper;

import java.util.List;

import com.zyd.pojo.User;

public interface UserMapper {
	
	/**
	 * 插入用户信息
	 * @param user
	 */
	void insertUser(User user);
	
	/**
	 * 修改昵称
	 * @param user
	 */
	void updateUserNickName(User user);
	
	/**
	 * 更新密码
	 * @param user
	 */
	void updateUserPassword(User user);
	
	/**
	 * 查找用户信息
	 * @param userId
	 * @return
	 */
	User selectUser(int userId);
	
	List<User> selectAllUser();
}
