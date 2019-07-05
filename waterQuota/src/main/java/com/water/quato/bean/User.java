package com.water.quato.bean;
/**
 * user表 存放用户名、密码、用户身份信息。
 * @author QvQ
 *
 */
public class User {

	private int id;
	private String userName;
	private String userPassword;
	private String userIdentity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userIdentity="
				+ userIdentity + "]";
	}
	
	
	
}
