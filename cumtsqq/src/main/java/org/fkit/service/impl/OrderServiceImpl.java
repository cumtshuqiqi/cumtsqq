package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.domain.Good;
import org.fkit.domain.Order;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.CartService;
import org.fkit.service.GoodService;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("OrderService")
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper OrderMapper;
	@Autowired
	private CartService cartservice;
	@Autowired
	private GoodService goodservice;
	
	
	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return OrderMapper.findAll();
	}
	
	@Override
	public Order findOrder(int good_id) {
		// TODO Auto-generated method stub
		return OrderMapper.findWithId(good_id);
	}
	
	@Override
	public Order saveOrder(int good_id) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setGood_id(good_id);
		Cart cart=cartservice.findCart(good_id);
		int i=cart.getGood_count();
		order.setGood_count(i);
		//销售
		int h=order.getGood_sale();
		order.setGood_sale(h + i);
		
		Good good=goodservice.findWithId(good_id);
		int j=good.getGood_count();
		good.setGood_count(j-i);
		int d=good.getGood_price();
		order.setMoney(d*i);
		//库存
		String a=new String();
		a="未发货";
		order.setGood_info(a);
		OrderMapper.saveOrder(order);
		return order;
	}
	

	@Override
	public Order removeOrder(int good_id) {
		// TODO Auto-generated method stub
		Order order = OrderMapper.findWithId(good_id);
		
		OrderMapper.removeOrder(order);
		return order;
	}

	@Override
	public Order putOrder(int good_id) {
		// TODO Auto-generated method stub
		Order order=OrderMapper.findWithId(good_id);

		String good_info=new String();
		good_info="已发货";
		order.setGood_info(good_info);
		
		OrderMapper.putOrder(order);
		return order;
		
	}

	@Override
	public Order getOrder(int good_id) {
		// TODO Auto-generated method stub
		Order order=OrderMapper.findWithId(good_id);
		String good_info=order.getGood_info();
		String c=new String("已发货");
		if(c.equals(good_info)){		
		good_info="已签收";
		order.setGood_info(good_info);}else{
			good_info="未发货";
			order.setGood_info(good_info);}
		OrderMapper.getOrder(order);
		return order;
	}

	@Override
	public Order comment(int good_id) {
		// TODO Auto-generated method stub
		Order order=OrderMapper.findWithId(good_id);
		String description=new String();
		description="$_POST['description']";
		order.setDescription(description);
		
		String logistics=new String();
		logistics="$_POST['logistics']";
		order.setLogistics(logistics);
		
		String service=new String();
		service="$_POST['service']";
		order.setService(service);
		
		OrderMapper.comment(order);
		return order;
	}

}
