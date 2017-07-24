package sqq;

import org.fkit.domain.Good;
import org.fkit.service.GoodService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})

public class good_test {

	@Autowired
	private GoodService goodService;
	
	//添加商品
	@Before
	public void goodaddtest() {
		goodService.goodadd(26, "臭鱼", "25.jpg", "sqq", "鞋子", 20, 1, "丑");
		System.out.println("测试 添加 商品");
	}
	
	//测试删除商品
	@Test
	public void removeGoodtest() {
		Good good=goodService.removeGood(25);
		System.out.println("测试 删除商品");
	}
	
	//测试查询商品
	@Test
	public  void findtest() {
		Good good=goodService.findWithId(13);
		System.out.println("测试查询商品");
		System.out.println(good.getGood_id()+","+good.getGood_name()+","+good.getGood_image()+","+good.getGood_shoper()+","+good.getGood_type()+","+good.getGood_price()+","+good.getGood_count()+good.getGood_sale());
	}
}
