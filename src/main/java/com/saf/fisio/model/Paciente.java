package com.saf.fisio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pacientes")
@Getter
@Setter
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String sexo;
    private String cidade;
    private String bairro;
    private String profissao;
    private String enderecoResidencial;
    private String enderecoComercial;
    private String naturalidade;
    private String estadoCivil;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Anamnese> anamneses;
}