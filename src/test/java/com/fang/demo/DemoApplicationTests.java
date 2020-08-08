package com.fang.demo;

import com.fang.controller.TestController;
import com.fang.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

	@Autowired(required = false)
	private TestController test;

	@Test
	void contextLoads() {

		User user = new User(4,"2222","123","女",new Date(),"四川省","123@qq.com","2",new Date(),new Date());
		/*test.add(user);*/
		/*user.setMobile("1212");
		test.update(user);*/
		test.delete(3);
	}

}
