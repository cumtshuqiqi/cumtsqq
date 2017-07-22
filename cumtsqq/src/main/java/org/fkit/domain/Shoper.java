package org.fkit.domain;

import java.io.Serializable;

/**
 * CREATE TABLE tb_shoper(
shoper_id INT PRIMARY KEY AUTO_INCREMENT,      #shoper_id
shoper_name VARCHAR(50) UNIQUE,		#登录名 
PASSWORD VARCHAR(18),			#密码
sex VARCHAR(18),			#性别
shoper_phone VARCHAR(18),			#电话
shoper_address VARCHAR(255)			#地址
);
 * */
public class Shoper implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -640552798346550269L;
	private Integer shoper_id;			// shoper_id
	private String shoper_name;	// 登录名
	private String shoper_password;	// 密码
	private String shoper_phone;		// 电话
	private String shoper_address;		// 地址
	
	public Shoper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getShoper_id() {
		return shoper_id;
	}
	public void setShoper_id(Integer shoper_id) {
		this.shoper_id = shoper_id;
	}
	public String getShoper_name() {
		return shoper_name;
	}
	public void setShoper_name(String shoper_name) {
		this.shoper_name = shoper_name;
	}
	public String getShoper_password() {
		return shoper_password;
	}
	public void setShoper_password(String shoper_password) {
		this.shoper_password = shoper_password;
	}
	public String getShoper_phone() {
		return shoper_phone;
	}
	public void setShoper_phone(String shoper_phone) {
		this.shoper_phone = shoper_phone;
	}
	public String getShoper_address() {
		return shoper_address;
	}
	public void setShoper_address(String shoper_address) {
		this.shoper_address = shoper_address;
	}
	@Override
	public String toString() {
		return "Shoper [shoper_id=" + shoper_id + ", shoper_name=" + shoper_name + ", shoper_password="
				+ shoper_password + ",  shoper_phone=" + shoper_phone
				+ ", shoper_address=" + shoper_address + "]";
	}

	
}
