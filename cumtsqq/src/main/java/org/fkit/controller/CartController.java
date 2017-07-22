package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("CartService")
	private CartService CartService;
	
	@RequestMapping(value = "/cart")
	public String cart(Model model) {
		
		// 获得所有商品集合
		List<Cart> cart_list = CartService.getAll();
		// 将商品集合添加到model当中
		
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	
	}
	
	@RequestMapping(value = "/save")
	public String save(HttpServletRequest request,Model model,HttpSession session,int good_id) {
		
		Cart cart=CartService.findCart(good_id);
		if (cart == null) {
			CartService.saveCart(good_id);
		}else {			
			CartService.addCart(good_id);	
		}
		List<Cart> cart_list = CartService.getAll();
		// 将商品集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		
		
		// 跳转到cart页面
		return "cart";
	}
	//清空购物车
	@RequestMapping(value = "/clear")
	public String clear(Model model) {
		CartService.clearCart();
		List<Cart> cart_list = CartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到main页面
		return "cart";

	}
	//从购物车里减少数量
	@RequestMapping(value="/reduce")
	public String reduce(Model model,HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id1 = Integer.parseInt(good_id);
		CartService.reduceCart(good_id1);
		List<Cart> cart_list = CartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	//从购物车里增加数量
	@RequestMapping(value="/add")
	public String add(Model model,HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id1 = Integer.parseInt(good_id);
		CartService.addCart(good_id1);
		List<Cart> cart_list = CartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	//取消购物车的东西
	@RequestMapping(value="/remove")
	public String remove(Model model,HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id1 = Integer.parseInt(good_id);
		CartService.removeCart(good_id1);
		List<Cart> cart_list = CartService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	}
	

}
