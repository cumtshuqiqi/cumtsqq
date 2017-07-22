package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.fkit.domain.Good;
import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GoodController {
	/**
	 * 自动注入GoodService
	 * */
	@Autowired
	@Qualifier("GoodService")
	private GoodService GoodService;

	/**
	 * 处理href请求
	 * */
	//获取所有商品的集合
	@RequestMapping(value="/good")
	 public String good(Model model){
		// 获得所有商品集合
		List<Good> good_list = GoodService.getAll();
		model.addAttribute("good_list", good_list);
		// 跳转到good页面
		return "good";
	}
	
	// 获得所有裙子的集合
			@RequestMapping(value="/select")
			 public String select(Model model, int good_id){
				// 获得所选商品集合
				List<Good> select_list = GoodService.segetAll(good_id);
				// 将商品集合添加到model当中
				model.addAttribute("select_list", select_list);
				// 跳转到skirt页面
				return "select";
			}
			

	
	// 获得所有裙子的集合
		@RequestMapping(value="/skirt")
		 public String skirt(Model model){
			// 获得所有商品集合
			String good_type="skirt";
			List<Good> skirt_list = GoodService.skgetAll(good_type);
			// 将商品集合添加到model当中
			model.addAttribute("skirt_list", skirt_list);
			// 跳转到skirt页面
			return "skirt";
		}
		
		// 获得所有裙子的集合
				@RequestMapping(value="/goodskirt")
				 public String goodskirt(Model model){
					// 获得所有商品集合
					String good_type="skirt";
					List<Good> skirt_list = GoodService.skgetAll(good_type);
					// 将商品集合添加到model当中
					model.addAttribute("skirt_list", skirt_list);
					// 跳转到skirt页面
					return "goodskirt";
				}
		
		@RequestMapping(value="/coat")
		 public String coat(Model model){
			// 获得所有商品集合
			String good_type="coat";
			List<Good> coat_list = GoodService.cogetAll(good_type);
			// 将商品集合添加到model当中
			model.addAttribute("coat_list", coat_list);
			// 跳转到coat页面
			return "coat";
		}
		
		
		@RequestMapping(value="/goodcoat")
		 public String goodcoat(Model model){
			// 获得所有商品集合
			String good_type="coat";
			List<Good> coat_list = GoodService.cogetAll(good_type);
			// 将商品集合添加到model当中
			model.addAttribute("coat_list", coat_list);
			// 跳转到coat页面
			return "goodcoat";
		}
		
		@RequestMapping(value="/pants")		
		public String pants(Model model){
			// 获得所有商品集合
			String good_type="pants";
			List<Good> pants_list = GoodService.pagetAll(good_type);
			// 将商品集合添加到model当中
			model.addAttribute("pants_list", pants_list);
			// 跳转到pants页面
			return "pants";
		}
		
		@RequestMapping(value="/goodpants")		
		public String goodpants(Model model){
			// 获得所有商品集合
			String good_type="pants";
			List<Good> pants_list = GoodService.pagetAll(good_type);
			// 将商品集合添加到model当中
			model.addAttribute("pants_list", pants_list);
			// 跳转到pants页面
			return "goodpants";
		}
		
		
		@RequestMapping(value="/shoe")
		public String shoe(Model model){
			// 获得所有商品集合
			String good_type="shoe";
			List<Good> shoe_list = GoodService.shgetAll(good_type);
			// 将商品集合添加到model当中
			model.addAttribute("shoe_list", shoe_list);
			// 跳转到shoe页面
			return "shoe";
		}	
		
		@RequestMapping(value="/goodshoe")
		public String goodshoe(Model model){
			// 获得所有商品集合
			String good_type="shoe";
			List<Good> shoe_list = GoodService.shgetAll(good_type);
			// 将商品集合添加到model当中
			model.addAttribute("shoe_list", shoe_list);
			// 跳转到shoe页面
			return "goodshoe";
		}	
		
		//添加商品
		@RequestMapping(value = "/goodadd",method = RequestMethod.POST)

		public ModelAndView goodadd(Integer good_id, String good_name,String good_image,String good_shoper,String good_type,Integer good_count,Integer good_price,String good_intro,ModelAndView mv, HttpSession session) {
			// 根据输入的登录名和密码向数据库中添加新的用户信息,完成注册
			Good good = GoodService.goodadd(good_id, good_name,good_image,good_shoper,good_type,good_count,good_price,good_intro);
				// 添加商品成功，将good对象设置到HttpSession作用范围域
				session.setAttribute("good", good);
				// 转发到login请求
				mv.setViewName("goodadd");
				
				return mv;}
		
		//商品更新
		
		@RequestMapping(value = "/goodupdate")

		public ModelAndView goodupdate(Integer good_id, String good_name,String good_image,String good_shoper,String good_type,Integer good_count,Integer good_sale,Integer good_price,String good_intro,ModelAndView mv, HttpSession session) {
			// 根据输入的登录名和密码向数据库中添加新的用户信息,完成注册
			Good good = GoodService.goodupdate(good_id,good_name,good_image,good_shoper,good_type,good_count,good_sale,good_price,good_intro);
				// 添加商品成功，将good对象设置到HttpSession作用范围域
				session.setAttribute("good", good);
				// 转发到goodupdate请求
				mv.setViewName("goodupdate");
				
				return mv;}
		
//		@RequestMapping(value = "/goodupdate",method = RequestMethod.POST)
//		public String goodupdate(Model model, HttpServletRequest request, String good_name, String good_image, String good_shoper, String good_type, String good_intro, Integer good_price, Integer good_count, Integer good_sale) {
//			String good_id=request.getParameter("good_id");
//			Integer good_id_=Integer.parseInt(good_id);
//			GoodService.findWithId(good_id_);              
//			GoodService.goodupdate(good_id_, good_name, good_image, good_shoper, good_type, good_count,good_sale, good_price, good_intro);
//			List<Good> good_list=GoodService.getAll();
//			model.addAttribute("good_list",good_list);
//			return "good";
//			}
	    
		//下架
		@RequestMapping(value="/removegood")
		public String removegood(Model model,HttpServletRequest request){
			String good_id = request.getParameter("good_id");
			Integer good_id_ = Integer.parseInt(good_id);
			GoodService.removeGood(good_id_);	
			List<Good> good_list = GoodService.getAll();
			// 将商品集合添加到model当中
			model.addAttribute("good_list", good_list);
			// 跳转到collect页面
			return "good";
		}
		
		//商品详情
		@RequestMapping(value="detail")
		public String detail(HttpServletRequest request,Model model){
			String good_id = request.getParameter("good_id");
			int id = Integer.parseInt(good_id);
			Good good=GoodService.findWithId(id);
			model.addAttribute("good", good);
			model.addAttribute("good_img", good.getGood_image());
			model.addAttribute("image1", good.getGood_image1());
			model.addAttribute("image2", good.getGood_image2());
			model.addAttribute("good_intro", good.getGood_intro());
			model.addAttribute("good_price", good.getGood_price());
			model.addAttribute("good_type", good.getGood_type());
			return "detail";
			
		}

}
