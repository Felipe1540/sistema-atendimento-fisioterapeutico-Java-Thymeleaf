    CREATE TABLE avaliacoes_pediatria (
        id BIGSERIAL PRIMARY KEY,
        paciente_id BIGINT REFERENCES pacientes(id),
        data_avaliacao DATE DEFAULT CURRENT_DATE,

        -- Responsáveis (Conforme o documento)
        nome_responsavel_1 VARCHAR(255),
        profissao_responsavel_1 VARCHAR(100),
        escolaridade_responsavel_1 VARCHAR(100),
        nome_responsavel_2 VARCHAR(255),
        profissao_responsavel_2 VARCHAR(100),

        -- Dinâmica Familiar
        quem_cuida_crianca VARCHAR(100),
        pessoas_na_casa INTEGER,

        -- Histórico Gestacional
        gestas INTEGER,
        partos INTEGER,
        abortos INTEGER,
        intercorrencias_gestacao TEXT,
        tipo_parto VARCHAR(50),
        peso_nascimento DOUBLE PRECISION,
        comprimento_nascimento DOUBLE PRECISION,
        apgar_1_min INTEGER,
        apgar_5_min INTEGER,

        -- Desenvolvimento Motor (Marcos)
        idade_sustentou_cabeca VARCHAR(50),
        idade_sentou VARCHAR(50),
        idade_engatinhou VARCHAR(50),
        idade_andou VARCHAR(50),

        -- Observações
        objetivos_terapeuticos TEXT,
        condutas_fisioterapeuticas TEXT
    );