package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Shoper;
import org.fkit.service.ShoperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class ShoperController {
	
	/**
	 * 自动注入ShoperService
	 * */
	@Autowired
	@Qualifier("shoperService")
	private ShoperService shoperService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/shoperlogin")
	 public ModelAndView login(
			 Integer shoper_id,String shoper_password,
			 ModelAndView mv,
			 HttpSession session,HttpServletRequest request){
		// 根据登录名和密码查找用户，判断用户登录
		Shoper shoper = shoperService.login(shoper_id, shoper_password);
		if(shoper != null){
			// 登录成功，将shoper对象设置到HttpSession作用范围域
			session.setAttribute("shoper", shoper);
			// 转发到mainshop请求
			mv.setViewName("shoper");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("shoperlogin");
		}
		
		return mv;
	}
	
	 @RequestMapping(value = "/shoperregist",method = RequestMethod.POST)

		public ModelAndView register(Integer shoper_id, String shoper_name,String shoper_password,String shoper_phone,String shoper_address,ModelAndView mv, HttpSession session) {
			// 根据输入的登录名和密码向数据库中添加新的用户信息,完成注册
			Shoper shoper = shoperService.register(shoper_id, shoper_name,shoper_password,shoper_phone,shoper_address);
			// 注册成功，将shoper对象设置到HttpSession作用范围域
			session.setAttribute("shoper", shoper);
			// 转发到login请求
			mv.setViewName("shoperlogin");
			return mv;
		}
	 //通过账号以及手机号来找回密码
	 @RequestMapping(value="/shoperfind",method = RequestMethod.POST)
	 public ModelAndView findshoper_shoper_password(String shoper_name,String shoper_phone,ModelAndView mv, HttpSession session){
		 Shoper shoper=shoperService.find(shoper_name, shoper_phone);
		 if(shoper != null){
			// 登录成功，将shoper对象设置到HttpSession作用范围域
				session.setAttribute("shoper", shoper);
				System.out.println(shoper.getShoper_password());
				// 转发到findshoper_password请求
				mv.setViewName("shoperlogin");
		 }else{
				// 验证失败，设置失败提示信息，并跳转到找回密码页面
				mv.addObject("message", "账户名或者电话错误，请重新输入!");
				mv.setViewName("shoperfind");
			}
			return mv;
		 
		 
	 }
}
