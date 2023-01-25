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

INSERT INTO tb_curso (nome, img_Uri, img_Gray_Uri) VALUES ('Bootcamp SPRING', 'https://www.publicdomainpictures.net/pictures/390000/nahled/course-introduction.jpg', 'https://i0.hippopx.com/photos/933/428/927/financial-equalization-help-stock-exchange-pay-preview.jpg');

INSERT INTO tb_oferta (edicao, momento_Inicial, momento_Final, curso_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2022-10-25T03:00:00Z', TIMESTAMP WITH TIME ZONE '2023-10-25T03:00:00Z', 1);
INSERT INTO tb_oferta (edicao, momento_Inicial, momento_Final, curso_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2022-11-25T03:00:00Z', TIMESTAMP WITH TIME ZONE '2023-11-25T03:00:00Z', 1);


INSERT INTO tb_enrollment (usuario_id, oferta_id, enroll_Moment, refund_Moment, avaliable, only_Update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2022-10-25T13:00:00Z', null, true, false);
INSERT INTO tb_enrollment (usuario_id, oferta_id, enroll_Moment, refund_Moment, avaliable, only_Update) VALUES (2, 1, TIMESTAMP WITH TIME ZONE '2022-10-25T13:00:00Z', null, true, false);

INSERT INTO tb_resource (title, description, position, img_Uri, type, oferta_id) VALUES ('Noticias', 'Noticias sobre skt de Brasília e entorno', 1, 'https://www.publicdomainpictures.net/pictures/390000/nahled/course-introduction.jpg', 0, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, oferta_id) VALUES ('Instagram', 'Bankssslife', 2, 'logoBanks.jpg', 1, 1);
INSERT INTO tb_resource (title, description, position, img_Uri, type, oferta_id) VALUES ('História', 'Lendas locais e visitas', 1, 'fotoLendas.jpg', 2, 1);