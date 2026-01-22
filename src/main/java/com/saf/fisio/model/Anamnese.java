package com.saf.fisio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "anamneses")
@Getter
@Setter
public class Anamnese {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    private LocalDate dataAvaliacao;

    @Column(columnDefinition = "TEXT")
    private String diagnosticoClinico;

    @Column(columnDefinition = "TEXT")
    private String diagnosticoFisioterapeutico;

    // Seção 2: Avaliação [cite: 11]
    @Column(columnDefinition = "TEXT")
    private String historiaClinica;

    @Column(columnDefinition = "TEXT")
    private String queixaPrincipal;

    @Column(columnDefinition = "TEXT")
    private String habitosVida;

    private String hma;
    private String hmp;
    private String antecedentesPessoais;
    private String antecedentesFamiliares;
    private String tratamentosRealizados;

    // Exame Clínico/Físico
    private String apresentacaoPaciente; // Para Deambulando, Cadeira de rodas, etc
    private boolean usaMedicamentos;
    private String quaisMedicamentos;
    private int dorEva; // Escala Visual Analógica 0-10

    //  Plano Terapêutico
    @Column(columnDefinition = "TEXT")
    private String objetivosTratamento;

    @Column(columnDefinition = "TEXT")
    private String planoTratamento;
}