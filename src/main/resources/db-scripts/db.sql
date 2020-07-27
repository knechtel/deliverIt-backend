--liquibase formatted sql
--changeset knechtel:v1

use deliver;

DROP TABLE IF EXISTS `regra_juros`;
create or replace table regra_juros
(
	id int auto_increment
		primary key,
	dias int null,
	multa double null,
	porcentagem_juros_por_dia double null
);
DROP TABLE IF EXISTS `conta`;

create or replace table conta
(
	id int auto_increment
		primary key,
	data_pagamento date null,
	data_vencimento date null,
	nome varchar(255) null,
	valor_original double null,
	regra_juros_id int null,
	constraint FK6oof07is7n8n8h4v7ewo8289e
		foreign key (regra_juros_id) references regra_juros (id)
);
INSERT INTO deliver.regra_juros (id, dias, multa, porcentagem_juros_por_dia) VALUES (1, 6, 0.05, 0.003);
INSERT INTO deliver.regra_juros (id, dias, multa, porcentagem_juros_por_dia) VALUES (2, 4, 0.03, 0.002);
INSERT INTO deliver.regra_juros (id, dias, multa, porcentagem_juros_por_dia) VALUES (3, 3, 0.02, 0.001);

INSERT INTO deliver.conta (id, data_pagamento, data_vencimento, nome, valor_original, regra_juros_id) VALUES (1, '2020-08-15', '2020-07-31', 'Jose Silva', 1800, 1);
INSERT INTO deliver.conta (id, data_pagamento, data_vencimento, nome, valor_original, regra_juros_id) VALUES (2, '2020-08-15', '2020-07-31', 'Joao da silva', 340, 1);
INSERT INTO deliver.conta (id, data_pagamento, data_vencimento, nome, valor_original, regra_juros_id) VALUES (3, '2020-08-02', '2020-07-31', 'Tomas Gomes', 140, 3);