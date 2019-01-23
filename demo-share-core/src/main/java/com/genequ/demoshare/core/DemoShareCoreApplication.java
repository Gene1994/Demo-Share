package com.genequ.demoshare.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.genequ.demoshare.core.mapper")
public class DemoShareCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoShareCoreApplication.class, args);
	}
}
