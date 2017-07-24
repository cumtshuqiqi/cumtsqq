package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.domain.Order;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class OrderController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("OrderService")
	private OrderService OrderService;
//	@Autowired
//	private GoodService goodService;

	@RequestMapping(value = "/order")
	public String order(Model model) {
		
		// 获得所有商品集合
		List<Order> order_list = OrderService.getAll();
		// 将商品集合添加到model当中
		
		model.addAttribute("order_list", order_list);
		// 跳转到order页面
		return "order";
	
	}
	
	@RequestMapping(value = "/xingxing")
	public String xingxing(Model model) {
		
		// 获得所有商品集合
		List<Order> order_list = OrderService.getAll();
		// 将商品集合添加到model当中
		
		model.addAttribute("order_list", order_list);
		// 跳转到order页面
		return "order";
	
	}
	
	@RequestMapping(value = "/goodorder")
	public String goodorder(Model model) {
		
		// 获得所有商品集合
		List<Order> order_list = OrderService.getAll();
		// 将商品集合添加到model当中
		
		model.addAttribute("order_list", order_list);
		// 跳转到order页面
		return "goodorder";
	
	}
	
	@RequestMapping(value = "/saveorder")
	public String saveorder(HttpServletRequest request,Model model,  int good_id) {
		
		Order order=OrderService.findOrder(good_id);

			StringBuffer url = new StringBuffer();
			StringBuilder builder = new StringBuilder();
			// 正文
			builder.append(
					"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head><body>");
			url.append("<font color='red'>" + order + "</font>");
			builder.append("<br/><br/>");
			builder.append("<div>" + url + "</div>");
			builder.append("</body></html>");
			SimpleEmail sendemail = new SimpleEmail();
			sendemail.setHostName("smtp.163.com");// 指定要使用的邮件服务器
			sendemail.setAuthentication("cumtsqq@163.com", "145s486q");// 使用163的邮件服务器需提供在163已注册的用户名、密码
			sendemail.setCharset("UTF-8");
			try {
				sendemail.setCharset("UTF-8");
				sendemail.addTo("1454867406@qq.com");
				sendemail.setFrom("cumtsqq@163.com");
				sendemail.setSubject("订单通知");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			} catch (EmailException e) {
				e.printStackTrace();
			}
				
			OrderService.saveOrder(good_id);	
		
		List<Order> order_list = OrderService.getAll();
		// 将商品集合添加到model当中
		model.addAttribute("order_list", order_list);
		
		// 跳转到order页面
		return "order";
	}
	
	@RequestMapping(value="/putorder")
	public String putorder(Model model,HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		OrderService.putOrder(good_id_);
		List<Order> order_list = OrderService.getAll();
		// 将商品集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到goodorder页面
		return "goodorder";
	}
	
	@RequestMapping(value="/getorder")
	public String getorder(Model model,HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		OrderService.getOrder(good_id_);
		List<Order> order_list = OrderService.getAll();
		// 将商品集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到order页面
		return "order";
	}
		
		@RequestMapping(value="/removeorder")
		public String removeorder(Model model,HttpServletRequest request){
			String good_id = request.getParameter("good_id");
			int good_id_ = Integer.parseInt(good_id);
			OrderService.removeOrder(good_id_);
			List<Order> order_list = OrderService.getAll();
			// 将商品集合添加到model当中
			model.addAttribute("order_list", order_list);
			// 跳转到collect页面
			return "order";
		}
		
		@RequestMapping(value="/comment",method = RequestMethod.POST)
		
		public String comment(Model model,HttpServletRequest request, Object order){
			String good_id = request.getParameter("good_id");
			int good_id_ = Integer.parseInt(good_id);
			
			String logistics=request.getParameter("logistics");
			String server=request.getParameter("server");
			String quality=request.getParameter("quality");
			OrderService.comment(good_id_,logistics,server,quality);
			List<Order> order_list = OrderService.getAll();
			// 将商品集合添加到model当中
			model.addAttribute("order_list", order_list);
			// 跳转到order页面
			return "xingxing";
		}
}