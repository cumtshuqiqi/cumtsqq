package org.fkit.service;

import org.apache.ibatis.annotations.Param;
import org.fkit.domain.User;

/**
 * User服务层接口
 * */
public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(Integer user_id,String password);
	User register(Integer user_id,String loginname,String password,String email,String phone,String address);
	User find(String loginname,String email);
	void update(Integer user_id, String password);
	 User findByUser_Id(Integer user_id);
}
