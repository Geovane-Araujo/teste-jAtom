package com.testelib.model.documentos;

import com.jatom.anotations.Fk;
import com.jatom.anotations.Id;
import com.jatom.anotations.Ignore;
import com.jatom.anotations.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;


@ToString
@Getter
@Setter
@TableName("cpf")
public class Cpf {

    @Id
    private int id;

    @Fk("iddocumento")
    private int iddocumento;

    private String cpf;

    private Date dataemissao;

    // @Fk("id_pessoa")
    @Ignore
    private int idpessoa;

}
