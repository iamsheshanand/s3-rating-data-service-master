package com.tsr.s3ratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class S3RatingDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3RatingDataServiceApplication.class, args);
	}

}
