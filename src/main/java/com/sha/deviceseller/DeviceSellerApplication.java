package com.sha.deviceseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@PropertySource("classpath:application.${spring.profiles.active:default}.properties")
public class DeviceSellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceSellerApplication.class, args);
	}

}