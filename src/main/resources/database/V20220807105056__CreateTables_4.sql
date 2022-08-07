create table if not exists pessoa_telefone(

      id serial PRIMARY key,
      idpessoa int,
      telefone varchar(20),
      tipo int
);