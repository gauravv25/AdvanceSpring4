package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages="demo")
public class Launch {

	public static void main(String[] args) {
		SpringApplication.run(Launch.class, args);
	}
}
