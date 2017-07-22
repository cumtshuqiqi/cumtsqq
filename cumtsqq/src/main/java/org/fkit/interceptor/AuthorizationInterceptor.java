package org.fkit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fkit.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthorizationInterceptor implements HandlerInterceptor{
	//不拦截“/login”和"login"请求
	private static final String[] IGNORE_URI={"login","find","new","shoperlogin","index","shoper","goodadd","regist","good","update","putorder"};
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AuthorizationInterceptor preHandle-->");
		//flag变量用于判断 用户是否登录，默认为false
		boolean flag=false;
		//获取请求路径判断
		String servletPath=request.getServletPath();
				
		//获取请求是否拦截
		for  (String s:IGNORE_URI){
			if(servletPath.contains(s)){
				flag=true;
				break;
			}
			
		}
		if(!flag){
			//获取session中的用户
			User user=(User) request.getSession().getAttribute("user");
			//判断用户是否已经登录
			if(user==null){
				//如果没有登录 ，则设置提示信息，跳转至 登录页面
				System.out.println("AuthorizationInterceptor拦截请求：");
				request.setAttribute("message", "请先登录再访问网站");
				request.getRequestDispatcher("login").forward(request, response);
			}else{
				//用户已经登录，则验证通过，放行
				System.out.println("AuthorizationInterceptor放行请求：");
				flag=true;
			}
		}
		return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mv) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AuthorizationInterceptor postHandle-->");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AuthorizationInterceptor afterCompletion-->");
		
	}

}
