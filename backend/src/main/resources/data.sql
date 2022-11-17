INSERT INTO tb_usuario (nome, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_usuario (nome, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_usuario (nome, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_funcao (autoridade) VALUES ('FUNCAO_SKATISTA');
INSERT INTO tb_funcao (autoridade) VALUES ('FUNCAO_LOCAL');
INSERT INTO tb_funcao (autoridade) VALUES ('FUNCAO_ADMIN');

INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (1, 1);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (2, 1);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (2, 2);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (3, 1);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (3, 2);
INSERT INTO tb_usuario_funcao (usuario_id, funcao_id) VALUES (3, 3);