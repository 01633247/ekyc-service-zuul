package com.hkt.ekyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EkycServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkycServiceZuulApplication.class, args);
	}
}
