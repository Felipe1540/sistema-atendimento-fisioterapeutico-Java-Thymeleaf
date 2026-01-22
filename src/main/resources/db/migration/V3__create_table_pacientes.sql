CREATE TABLE pacientes (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_nascimento DATE,
    sexo VARCHAR(20),
    telefone VARCHAR(20),
    cidade VARCHAR(100),
    bairro VARCHAR(100),
    profissao VARCHAR(100),
    endereco_residencial VARCHAR(255),
    endereco_comercial VARCHAR(255),
    naturalidade VARCHAR(100),
    estado_civil VARCHAR(50),
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);