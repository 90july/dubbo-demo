package net.sunnada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:applicationContext-dubbo.xml")
@SpringBootApplication
public class UserServiceProviderBootApplication_20886 {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceProviderBootApplication_20886.class, args);
	}

}
