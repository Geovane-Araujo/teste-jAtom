create table if not exists pessoa_endereco(

      id serial PRIMARY key,
      idpessoa int,
      logradouro varchar(255),
      bairro varchar(70),
      numero varchar(10),
      complemento varchar(50),
      cep varchar(8)
);