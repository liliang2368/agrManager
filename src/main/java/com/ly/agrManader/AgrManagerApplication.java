package com.ly.agrManader;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ly.agrManader.dao.interface")
public class AgrManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgrManagerApplication.class, args);
	}

}
