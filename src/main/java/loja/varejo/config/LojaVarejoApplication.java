package loja.varejo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"loja.varejo.controller", "loja.varejo.service"})
public class LojaVarejoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVarejoApplication.class, args);
	}

}
