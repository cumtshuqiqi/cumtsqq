package sqq;

import org.fkit.domain.Cart;
import org.fkit.service.CartService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})

public class cart_test {

	@Autowired CartService cartService;
	
	@Before
	public void savecarttest() {
		Cart cart=cartService.saveCart(3);
		System.out.println("测试加入购物车");
		System.out.println(cart.getId()+","+cart.getGood_id()+","+cart.getGood_count());
	}
	
	@Test
	public void addcarttest() {
		Cart cart=cartService.addCart(1);
		System.out.println("测试增加购物车中商品数量");
	}
}
