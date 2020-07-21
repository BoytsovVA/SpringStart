package com.SpringStart.Controller;


import com.SpringStart.Controller.services.BuisnessServices;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class ControllerApplicationTests {
	@Autowired
	BuisnessServices buisnessServices;

	@Autowired
	ApplicationContext ctx;

//	@Autowired
//	Controller1 controller1;
//	@Test
//	void contextLoads() {
//	}

	@Test
	public void	getX1 () {

		Double ans = buisnessServices.getX1(1D, 20D, 3D);
		//BuisnessServices bs = (BuisnessServices) ctx.getBean("buisnessServices");
		//return buisnessServices.getX1(a, b, c).toString();
//		controller1.ftl();
//		assert 1!=1;
	}
}
