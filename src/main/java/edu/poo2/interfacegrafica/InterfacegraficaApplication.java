package edu.poo2.interfacegrafica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"edu.*"})
public class InterfacegraficaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfacegraficaApplication.class, args);
	}
}
