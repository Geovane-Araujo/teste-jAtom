package com.testelib.model;

import com.jatom.anotations.Fk;
import com.jatom.anotations.Id;
import com.jatom.anotations.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@TableName("pessoa_telefone")
public class PessoaTelefone {

    @Id
    private int id;

    @Fk("id_pessoa")
    private int idpessoa;

    private String telefone;

    private int tipo;
}
