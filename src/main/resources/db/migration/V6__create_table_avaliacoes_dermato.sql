CREATE TABLE avaliacoes_dermato (
    id BIGSERIAL PRIMARY KEY,
    paciente_id BIGINT REFERENCES pacientes(id),
    data_avaliacao DATE DEFAULT CURRENT_DATE,

    -- Perfil Ginecológico
    ciclo_menstrual VARCHAR(50), -- Regular/Irregular
    idade_menarca INTEGER,
    idade_menopausa INTEGER,
    num_partos_normais INTEGER,
    num_partos_cesarea INTEGER,
    uso_anticoncepcional VARCHAR(100),

    -- Hábitos e Histórico
    alimentacao VARCHAR(100), -- Regime/Balanceada/NDA
    atividade_fisica_pratica BOOLEAN,
    atividade_fisica_frequencia VARCHAR(50), -- 1x a 7x na semana
    tratamentos_esteticos_previos TEXT,
    medicacoes_em_uso TEXT,

    -- Exame Físico e Antropometria
    peso DOUBLE PRECISION,
    altura DOUBLE PRECISION,
    imc DOUBLE PRECISION,
    medida_cintura_abdominal DOUBLE PRECISION,
    limiar_dor VARCHAR(50), -- Normal/Aumentado/Diminuído
    fototipo_fitzpatrick INTEGER, -- I a VI

    -- Inspeção da Pele
    tipo_pele_face VARCHAR(50), -- Seca/Mista/Oleosa/Normal
    tipo_pele_corpo VARCHAR(50),
    presenca_acne_grau INTEGER,
    presenca_estrias TEXT,
    presenca_fibro_edema_geloide TEXT, -- Celulite

    -- Conclusão
    objetivos_terapeuticos TEXT,
    plano_tratamento TEXT
);