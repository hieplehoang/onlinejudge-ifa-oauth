package onlinejudge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OAuth2Application {
	public static void main(String[] args) {
		SpringApplication.run(OAuth2Application.class, args);
	}
}
