CREATE TABLE IF NOT EXISTS schema_information2(

    id serial primary key,
    description varchar(300),
    fileName varchar(300),
    dataexecution TIMESTAMP
);