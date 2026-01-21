package com.saf.fisio;

import com.saf.fisio.model.Usuario;
import com.saf.fisio.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SistemaDeAtendimentoFisioterapeuticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeAtendimentoFisioterapeuticoApplication.class, args);
	}
}
