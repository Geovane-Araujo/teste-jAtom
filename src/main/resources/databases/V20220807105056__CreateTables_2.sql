create table if not exists rg(

     id serial PRIMARY key,
     iddocumento int,
     rg varchar(11),
     dataemissao date,
     idpessoa int
);