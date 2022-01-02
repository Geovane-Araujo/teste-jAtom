create table if not exists cpf(

    id serial PRIMARY key,
    iddocumento int,
    cpf varchar(11),
    dataemissao date,
    idpessoa int
);

create table if not exists rg(

    id serial PRIMARY key,
    iddocumento int,
    rg varchar(11),
    dataemissao date,
    idpessoa int
);

create table if not exists pessoa_endereco(

    id serial PRIMARY key,
    idpessoa int,
    logradouro varchar(255),
    bairro varchar(70),
    numero varchar(10),
    complemento varchar(50),
    cep varchar(8)
);

create table if not exists pessoa_telefone(

    id serial PRIMARY key,
    idpessoa int,
    telefone varchar(20),
    tipo int
);

create table if not exists pessoa(

    id serial PRIMARY key,
    nome varchar(250),
    idade int
);

create table if not exists documentos(

    id serial PRIMARY key,
    idpessoa int
);


