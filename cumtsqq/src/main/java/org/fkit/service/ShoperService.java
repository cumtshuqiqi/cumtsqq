
package org.fkit.service;

import org.fkit.domain.Shoper;

/**
 * Shoper服务层接口
 * */
public interface ShoperService {
	
	/**
	 * 判断用户登录
	 * @param String shoper_name
	 * @param String shoper_password
	 * @return 找到返回Shoper对象，没有找到返回null
	 * */
	Shoper login(Integer shoper_id,String shoper_password);
	Shoper register(Integer shoper_id,String shoper_name,String shoper_password,String shoper_phone,String shoper_address);
	Shoper find(String shoper_name,String shoper_phone);
}
