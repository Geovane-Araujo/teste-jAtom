package com.testelib.model;


import com.jatom.anotations.Id;
import com.jatom.anotations.ListObject;
import com.jatom.anotations.SimpleObject;
import com.jatom.anotations.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@TableName("pessoa")
public class Pessoa {

    @Id(value = "id_pessoa")
    private int id;

    private String nome;

    private int idade;

    @SimpleObject
    private PessoaEndereco pesoPessoaEndereco = new PessoaEndereco();

    @ListObject
    private List<PessoaTelefone> pessoaTelefoneList = new ArrayList<>();

    @SimpleObject
    private Documentos documentos = new Documentos();

}
