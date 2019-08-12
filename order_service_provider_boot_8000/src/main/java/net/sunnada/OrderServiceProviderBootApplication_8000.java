package net.sunnada;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class OrderServiceProviderBootApplication_8000 {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceProviderBootApplication_8000.class, args);
	}

}
