package br.com.zup.edu.exposicao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Oauth2ClientLivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ClientLivrariaApplication.class, args);
	}

}
