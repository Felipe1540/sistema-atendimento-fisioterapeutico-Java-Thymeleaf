package com.saf.fisio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "avaliacoes_pediatria")
@Getter
@Setter
public class AvaliacaoPediatria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(name = "data_avaliacao")
    private LocalDate dataAvaliacao = LocalDate.now();

    // Responsáveis
    @Column(name = "nome_responsavel_1")
    private String nomeResponsavel1;
    @Column(name = "profissao_responsavel_1")
    private String profissaoResponsavel1;
    @Column(name = "escolaridade_responsavel_1")
    private String escolaridadeResponsavel1;

    @Column(name = "nome_responsavel_2")
    private String nomeResponsavel2;
    @Column(name = "profissao_responsavel_2")
    private String profissaoResponsavel2;

    // Dinâmica Familiar
    @Column(name = "quem_cuida_crianca")
    private String quemCuidaCrianca;
    @Column(name = "pessoas_na_casa")
    private Integer pessoasNaCasa;

    // Histórico Gestacional
    private Integer gestas;
    private Integer partos;
    private Integer abortos;
    @Column(name = "intercorrencias_gestacao", columnDefinition = "TEXT")
    private String intercorrenciasGestacao;
    @Column(name = "tipo_parto")
    private String tipoParto;
    @Column(name = "peso_nascimento")
    private Double pesoNascimento;
    @Column(name = "comprimento_nascimento")
    private Double comprimentoNascimento;
    @Column(name = "apgar_1_min")
    private Integer apgar1Min;
    @Column(name = "apgar_5_min")
    private Integer apgar5Min;

    // Desenvolvimento Motor
    @Column(name = "idade_sustentou_cabeca")
    private String idadeSustentouCabeca;
    @Column(name = "idade_sentou")
    private String idadeSentou;
    @Column(name = "idade_engatinhou")
    private String idadeEngatinhou;
    @Column(name = "idade_andou")
    private String idadeAndou;

    // Observações Finais
    @Column(name = "objetivos_terapeuticos", columnDefinition = "TEXT")
    private String objetivosTerapeuticos;
    @Column(name = "condutas_fisioterapeuticas", columnDefinition = "TEXT")
    private String condutasFisioterapeuticas;
}