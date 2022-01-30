package com.testelib.model;


import com.jatom.anotations.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@Union
@TableName("pessoa")
public class Pessoa {

    @Id(value = "id_pessoa")
    private int id;

    private String nome;

    private int idade;

    @Ignore
    @Join(reference = TipoPessoa.class,columnName = "descricao")
    private String descricaoTipoPessoa;

    private int idTipoPessoa;

    @SimpleObject
    private PessoaEndereco pesoPessoaEndereco = new PessoaEndereco();

    @ListObject
    private List<PessoaTelefone> pessoaTelefoneList = new ArrayList<>();

    @SimpleObject
    private Documentos documentos = new Documentos();

}
