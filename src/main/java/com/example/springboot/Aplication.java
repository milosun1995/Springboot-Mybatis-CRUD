package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot.dao")
public class Aplication {
	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}
}
