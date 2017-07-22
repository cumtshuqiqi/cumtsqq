
package org.fkit.service.impl;

import org.fkit.domain.Shoper;
import org.fkit.mapper.ShoperMapper;
import org.fkit.service.ShoperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Shoper服务层接口实现类
 * @Service("shoperService")用于将当前类注释为一个Spring的bean，名为shoperService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("shoperService")
public class ShoperServiceImpl implements ShoperService {
	
	/**
	 * 自动注入ShoperMapper
	 * */
	@Autowired
	private ShoperMapper shoperMapper;

	/**
	 * ShoperService接口login方法实现
	 * @see { ShoperService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public Shoper login(Integer shoper_id, String shoper_password) {
		return shoperMapper.findWithShoper_nameAndShoper_password(shoper_id, shoper_password);
	}
	
	@Override
	public Shoper register(Integer shoper_id,String shoper_name,String shoper_password,String shoper_phone,String shoper_address) {
		Shoper shoper=new Shoper();
		shoper.setShoper_id(shoper_id);
		shoper.setShoper_name(shoper_name);
		shoper.setShoper_password(shoper_password);
		shoper.setShoper_phone(shoper_phone);
		shoper.setShoper_address(shoper_address);
		shoperMapper.saveShoper(shoper);
		return shoper;}
	@Override
	public Shoper find(String shoper_name, String shoper_phone) {
		// TODO Auto-generated method stub
		 return shoperMapper.findShoper_password(shoper_name, shoper_phone);
	}


}