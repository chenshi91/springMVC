/**Created	by	chenshi  at	2018年1月2日 上午10:56:20*/
package com.quanhu.chens.entity;

import java.util.Date;

/**
 * @description:	User.java
 * @packageName:	com.quanhu.chens.entity
 * @projectName:	quanhu-springMVC1
 * @revision:   	v1.0.0
 * @author:   		chenshi
 */
public class User {
	
	private	String userName;
	private	String passWord;
	private	Address	addr;
	private	Date	birthday;
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
