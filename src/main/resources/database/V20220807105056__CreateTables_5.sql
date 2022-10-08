create table if not exists pessoa(

     id serial PRIMARY key,
     nome varchar(250),
     idade int,
     idTipoPessoa int
);