package com.saf.fisio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "avaliacoes_dermato")
@Getter
@Setter
public class AvaliacaoDermato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(name = "data_avaliacao")
    private LocalDate dataAvaliacao = LocalDate.now();

    // --- Perfil Ginecológico ---
    @Column(name = "ciclo_menstrual")
    private String cicloMenstrual;

    @Column(name = "idade_menarca")
    private Integer idadeMenarca;

    @Column(name = "idade_menopausa")
    private Integer idadeMenopausa;

    @Column(name = "num_partos_normais")
    private Integer numPartosNormais;

    @Column(name = "num_partos_cesarea")
    private Integer numPartosCesarea;

    @Column(name = "uso_anticoncepcional")
    private String usoAnticoncepcional;

    // --- Hábitos e Histórico ---
    @Column(name = "alimentacao")
    private String alimentacao;

    @Column(name = "atividade_fisica_pratica")
    private Boolean atividadeFisicaPratica;

    @Column(name = "atividade_fisica_frequencia")
    private String atividadeFisicaFrequencia;

    @Column(name = "tratamentos_esteticos_previos", columnDefinition = "TEXT")
    private String tratamentosEsteticosPrevios;

    @Column(name = "medicacoes_em_uso", columnDefinition = "TEXT")
    private String medicacoesEmUso;

    // --- Exame Físico e Antropometria ---
    @Column(name = "peso")
    private Double peso;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "imc")
    private Double imc;

    @Column(name = "medida_cintura_abdominal")
    private Double medidaCinturaAbdominal;

    @Column(name = "limiar_dor")
    private String limiarDor;

    @Column(name = "fototipo_fitzpatrick")
    private Integer fototipoFitzpatrick;

    // --- Inspeção da Pele ---
    @Column(name = "tipo_pele_face")
    private String tipoPeleFace;

    @Column(name = "tipo_pele_corpo")
    private String tipoPeleCorpo;

    @Column(name = "presenca_acne_grau")
    private Integer presencaAcneGrau;

    @Column(name = "presenca_estrias", columnDefinition = "TEXT")
    private String presencaEstrias;

    @Column(name = "presenca_fibro_edema_geloide", columnDefinition = "TEXT")
    private String presencaFibroEdemaGeloide;

    // --- Conclusão ---
    @Column(name = "objetivos_terapeuticos", columnDefinition = "TEXT")
    private String objetivosTerapeuticos;

    @Column(name = "plano_tratamento", columnDefinition = "TEXT")
    private String planoTratamento;
}