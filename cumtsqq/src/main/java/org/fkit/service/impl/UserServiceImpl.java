package org.fkit.service.impl;

import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;
	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(Integer user_id, String password) {
		return userMapper.findWithLoginnameAndPassword(user_id, password);
	}
	
	@Override
	public User register(Integer user_id,String loginname,String password,String email,String phone,String address) {
		User user=new User();
		user.setUser_id(user_id);
		user.setLoginname(loginname);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);
		userMapper.saveUser(user);
		return user;}
	@Override
	public User find(String loginname, String email) {
		// TODO Auto-generated method stub
		 return userMapper.find(loginname, email);
	}
	
	//修改密码
	@Override
	public void update(Integer user_id, String password) {
		// TODO Auto-generated method stub
		User user=userMapper.findByUser_Id(user_id);
		user.setUser_id(user_id);
		user.setPassword(password);
		userMapper.update(user);
	}

	@Override
	public User findByUser_Id(Integer user_id) {
		// TODO Auto-generated method stub
		return userMapper.findByUser_Id(user_id);
	}

}