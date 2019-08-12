package net.sunnada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:ftpclient.properties")
@SpringBootApplication
public class FtpclientBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtpclientBootApplication.class, args);
	}

}
