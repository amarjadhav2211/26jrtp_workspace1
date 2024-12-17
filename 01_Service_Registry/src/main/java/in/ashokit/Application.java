package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer           // represents this application as service registry application
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
