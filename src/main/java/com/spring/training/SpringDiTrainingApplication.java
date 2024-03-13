package com.spring.training;

import com.spring.training.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiTrainingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiTrainingApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("Main Method");
		System.out.println(controller.sayHello());

	}
}
