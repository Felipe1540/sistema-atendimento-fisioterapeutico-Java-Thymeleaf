-- Criar Tabela de Usuários
CREATE TABLE usuarios (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    ativo BOOLEAN DEFAULT TRUE
);

-- Criar Tabela de Perfis (Roles)
CREATE TABLE perfis (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

-- Tabela de Relacionamento / junção
CREATE TABLE usuario_perfis (
    usuario_id BIGINT REFERENCES usuarios(id),
    perfil_id BIGINT REFERENCES perfis(id),
    PRIMARY KEY (usuario_id, perfil_id)
);

-- Inserir Perfil Inicial
INSERT INTO perfis (nome) VALUES ('ROLE_FISIO');