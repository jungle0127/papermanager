package com.ncee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@MapperScan("com.ncee.dao.domain")
public class NCEEApplication {

	public static void main(String[] args) {
		SpringApplication.run(NCEEApplication.class, args);
	}

}
