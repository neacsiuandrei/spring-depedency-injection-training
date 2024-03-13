package com.spring.training;

import com.spring.training.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.awt.*;

@SpringBootTest
class SpringDiTrainingApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController controller;

	@Test
	void testAutowiredOfController() {
		System.out.println(controller.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
