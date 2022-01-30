package com.testelib.model;

import com.jatom.anotations.Id;
import com.jatom.anotations.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("tipo_pessoa")
public class TipoPessoa {

    @Id
    private int id;

    private String descricao;

}
