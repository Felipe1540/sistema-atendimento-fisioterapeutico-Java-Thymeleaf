package com.saf.fisio.service;

import com.saf.fisio.model.Usuario;
import com.saf.fisio.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService {

    private final UsuarioRepository repository;

    public AutenticacaoService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = repository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

        // Adicione isso no seu AutenticacaoService para testar na hora do login:
        BCryptPasswordEncoder testEncoder = new BCryptPasswordEncoder();
        boolean matches = testEncoder.matches("admin123", usuario.getSenha());
        System.out.println("O BCrypt reconhece a senha admin123 para este hash? " + matches);

        // LOG DE DEBUG SÊNIOR
        System.out.println("DEBUG - Email: " + usuario.getEmail());
        System.out.println("DEBUG - Hash no Banco: [" + usuario.getSenha() + "]");

        return usuario;
    }
}
