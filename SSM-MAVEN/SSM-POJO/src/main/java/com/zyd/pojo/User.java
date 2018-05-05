package com.zyd.pojo;

import java.sql.Date;

public class User {

	private Integer userId;// 用户id
	private String userName;// 用户账户
	private String nickName;// 用户昵称
	private String password;// 用户密码
	private Date createTime;// 用户创建时间

	public User() {
		super();
	}

	public User(String userName, String nickName, String password, Date createTime) {
		super();
		this.userName = userName;
		this.nickName = nickName;
		this.password = password;
		this.createTime = createTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", nickName=" + nickName + ", password=" + password
				+ ", createTime=" + createTime + "]";
	}

}
