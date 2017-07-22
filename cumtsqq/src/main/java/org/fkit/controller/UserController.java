package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.domain.User;
import org.fkit.service.UserService;
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
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 Integer user_id,String password,
			 ModelAndView mv,
			 HttpSession session,HttpServletRequest request){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(user_id, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到mainshop请求
			mv.setViewName("shop");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("login");
		}
		
		return mv;
	}
	
	 @RequestMapping(value = "/regist",method = RequestMethod.POST)

		public ModelAndView register(Integer user_id, String loginname,String password,String email,String phone,String address,ModelAndView mv, HttpSession session) {
			// 根据输入的登录名和密码向数据库中添加新的用户信息,完成注册
			User user = userService.register(user_id, loginname,password,email,phone,address);
			// 注册成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到login请求
			mv.setViewName("login");
			return mv;
		}
	
	 	
		@RequestMapping(value="/find",method = RequestMethod.POST)
		public ModelAndView find(
			String loginname,String email,
			ModelAndView mv,
			HttpSession session,HttpServletRequest request,HttpServletResponse response)throws Exception{	
				
		    User user=userService.find(loginname,email);

			if(user!=null){
				
				StringBuffer url = new StringBuffer();
				StringBuilder builder = new StringBuilder();
				// 正文
				builder.append(
						"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head><body>");
				url.append("<font color='red'>" + user + "</font>");
				builder.append("<br/><br/>");
				builder.append("<div>" + url + "</div>");
				builder.append("</body></html>");
				SimpleEmail sendemail = new SimpleEmail();
				sendemail.setHostName("smtp.163.com");// 指定要使用的邮件服务器
				sendemail.setAuthentication("cumtsqq@163.com", "145s486q");// 使用163的邮件服务器需提供在163已注册的用户名、密码
				sendemail.setCharset("UTF-8");
				try {
					sendemail.setCharset("UTF-8");
					sendemail.addTo(email);
					sendemail.setFrom("cumtsqq@163.com");
					sendemail.setSubject("找回密码");
					sendemail.setMsg(builder.toString());
					sendemail.send();
					System.out.println(builder.toString());
				} catch (EmailException e) {
					e.printStackTrace();
				}
				response.sendRedirect("login");	
			}else{
				response.getWriter().println("获取密码失败");
			}
		    return null;
		}
	
		@RequestMapping(value="/update",method = RequestMethod.POST)
		
		public ModelAndView update(Integer user_id,String password,
				 ModelAndView mv,
				 HttpSession session,HttpServletRequest request) {
			User user = userService.findByUser_Id(user_id);
			if(user != null){
				// 登录成功，将user对象设置到HttpSession作用范围域
				session.setAttribute("user", user);
				// 转发到mainshop请求
				mv.setViewName("updatepwd");
			}else{
				// 登录失败，设置失败提示信息，并跳转到登录页面
				mv.addObject("message", "登录名或密码错误，请重新输入!");
				mv.setViewName("login");
			}
			
			return mv;
		}	
			@RequestMapping(value="/updatepwd",method = RequestMethod.POST)
			
			public String updatepwd(HttpSession session,HttpServletRequest request) {
				User user=(User) session.getAttribute("user");
				Integer user_id=user.getUser_id();
				String password=request.getParameter("password");
				userService.update(user_id, password);
				return "login";
			}
}
