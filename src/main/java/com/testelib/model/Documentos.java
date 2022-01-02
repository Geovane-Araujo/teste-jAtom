package com.testelib.model;

import com.jatom.anotations.*;
import com.testelib.model.documentos.Cpf;
import com.testelib.model.documentos.Rg;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@TableName("documentos")
public class Documentos {

    @Id("iddocumento")
    private int id;

    @Fk("id_pessoa")
    private int idpessoa;

    @SimpleObject
    private Cpf cpf = new Cpf();

    @SimpleObject
    private Rg rg = new Rg();


}
