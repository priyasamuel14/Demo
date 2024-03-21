
package com.cg.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.cg.UserBean;

@ComponentScan("com.cg")
@PropertySource("classpath:/user.properties")
@SpringBootApplication
public class UserClient1 {
	public static void main(String args[]) {
		ApplicationContext context = SpringApplication.run(UserClient1.class, args);
		UserBean user= (UserBean)context.getBean("user");
		System.out.println(user.getUserId());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
	}

}
