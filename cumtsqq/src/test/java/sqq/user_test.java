package sqq;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})

public class user_test {

	@Autowired
	private  UserService userService;

	//测试注册
	@Before
	public void registertest() {
		userService.register(1213, "舒琪", "1113","1454867416@qq.com", "18252113311", "江苏徐州市");
		System.out.println("测试注册");
	}
	
	//测试找回密码
	@Test
	public void findtest(){
		User user=userService.find("舒琪琪", "1454867406@qq.com");
		System.out.println("测试 找回密码");
		System.out.println("密码为："+user.getPassword());
	}
	
}
