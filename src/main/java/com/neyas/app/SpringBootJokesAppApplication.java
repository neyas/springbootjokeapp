package com.neyas.app;

import com.neyas.app.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJokesAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootJokesAppApplication.class, args);

        System.out.println(ctx.getBean(JokeService.class).getJoke());
	}
}
