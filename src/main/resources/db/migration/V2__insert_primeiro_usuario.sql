-- 1. Garante que o perfil de Fisioterapeuta existe
INSERT INTO perfis (nome)
SELECT 'ROLE_FISIO'
WHERE NOT EXISTS (SELECT 1 FROM perfis WHERE nome = 'ROLE_FISIO');

-- 2. Insere o Usuário (Fisioterapeuta)
-- A senha abaixo corresponde a: admin123
INSERT INTO usuarios (nome, email, senha, ativo)
VALUES ('Juliana Boni', 'admin@saf.com', '$2a$10$8.UnVuG9HHgffUDAlk8q2OuVGkqEnLPzD3L9zpmWfUA.XxlD09O9.', true);

-- 3. Vincula o usuário ao perfil ROLE_FISIO
INSERT INTO usuario_perfis (usuario_id, perfil_id)
VALUES (
    (SELECT id FROM usuarios WHERE email = 'admin@saf.com'),
    (SELECT id FROM perfis WHERE nome = 'ROLE_FISIO')
);