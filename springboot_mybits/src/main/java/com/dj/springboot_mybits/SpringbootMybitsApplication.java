package com.dj.springboot_mybits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dj.springboot_mybits.mapper")
@SpringBootApplication
public class SpringbootMybitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybitsApplication.class, args);
	}
}
