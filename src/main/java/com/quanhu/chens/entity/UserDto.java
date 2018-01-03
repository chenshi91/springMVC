/**Created	by	chenshi  at	2018年1月2日 上午11:44:08*/
package com.quanhu.chens.entity;

import java.util.List;

/**
 * @description:	UserDto.java
 * @packageName:	com.quanhu.chens.entity
 * @projectName:	quanhu-springMVC1
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class UserDto {
	private	List<User>	userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
