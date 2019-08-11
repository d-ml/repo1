package com.xms;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MainApplication.class, args);
		SpringApplication app=
				new SpringApplication(MainApplication.class);
		
		//关闭Banner
		app.setBannerMode(Banner.Mode.OFF);
		
		app.run(args);
		
		
		
		
	}

}
