create table if not exists cpf(

      id serial PRIMARY key,
      iddocumento int,
      cpf varchar(11),
      dataemissao date,
      idpessoa int
);