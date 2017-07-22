package org.fkit.domain;

import java.io.Serializable;

/**
 * CREATE TABLE tb_user(
user_id INT PRIMARY KEY AUTO_INCREMENT,      #user_id
loginname VARCHAR(50) UNIQUE,		#登录名 
PASSWORD VARCHAR(18),			#密码
sex VARCHAR(18),			#性别
phone VARCHAR(18),			#电话
address VARCHAR(255)			#地址
);
 * */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -640552798346550269L;
	private Integer user_id;			// user_id
	private String loginname;	// 登录名
	private String password;	// 密码
	private String email;	// 性别
	private String phone;		// 电话
	private String address;		// 地址
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", loginname=" + loginname + ", password="
				+ password + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
}
