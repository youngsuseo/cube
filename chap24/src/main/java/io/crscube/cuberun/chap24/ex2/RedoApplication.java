package io.crscube.cuberun.chap24.ex2;

import io.crscube.cuberun.chap24.ex2.user.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedoApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ex2/chap24-context.xml");
		UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
		String user = userMapper.retrieveUser();
		System.out.println(user);
	}
}