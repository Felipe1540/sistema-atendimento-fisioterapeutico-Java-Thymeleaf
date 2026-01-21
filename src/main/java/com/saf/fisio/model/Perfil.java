package com.saf.fisio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "perfis")
@Getter
@Setter
public class Perfil implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // Ex: "ROLE_FISIO"

    @Override
    public String getAuthority() {
        return this.nome;
    }
}
