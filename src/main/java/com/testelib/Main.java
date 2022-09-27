package com.testelib;


import com.jatom.enuns.JAtomTypes;
import com.jatom.model.JAtomParameters;
import com.jatom.security.Security;
import com.testelib.model.Pessoa;
import com.testelib.model.PessoaTelefone;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws Exception {

//        PessoaRepository pessoaRepository = new PessoaRepository();
//        Pessoa p = loadData();
//
//
//        pessoaRepository.save(p);
        // System.out.println(p.toString());
//        AtomParameters jp = new JAtomParameters();
//        jp.put(JAtomTypes.SQL, "select * from pessoa");
//        System.out.printf(pessoaRepository.get(jp).toString());
        //MigrationDataBase mig = new MigrationDataBase();
        //mig.executeMigrationDataBaseResourcesIntoSchema();
        Security sec = new Security();
        String token = sec.generateToken("Usuario");
        boolean valid = sec.validToken(token);
        System.out.println(token);


//        Object obj = pessoaRepository.getByID(Pessoa.class, 32);
//        System.out.println(obj.toString());
    }


    public static Pessoa loadData(){

        Pessoa p = new Pessoa();

        // dados da pessoa
        p.setNome("Edna de Souza Bezerra " + UUID.randomUUID().toString());
        p.setIdade(27);
        p.setIdTipoPessoa(2);

        // dados de documentos
        p.getDocumentos().getCpf().setCpf(UUID.randomUUID().toString().substring(0,10));
        p.getDocumentos().getCpf().setDataemissao(new Date(2021,10,11));

        p.getDocumentos().getRg().setRg(UUID.randomUUID().toString().substring(0,10));
        p.getDocumentos().getRg().setDataemissao(new Date(2021,10,11));

        // Dados do endereço
        p.getPesoPessoaEndereco().setCep(UUID.randomUUID().toString().substring(0,7));
        p.getPesoPessoaEndereco().setLogradouro("Rua Maria Martinello Lavezzo");
        p.getPesoPessoaEndereco().setNumero("R629");
        p.getPesoPessoaEndereco().setBairro("Fraron");
        p.getPesoPessoaEndereco().setComplemento("Porão");

        List<PessoaTelefone> pessoaTelefoneList = new ArrayList<>();

        for (int i = 0;i < 3; i++){
            PessoaTelefone pessoaTelefone = new PessoaTelefone();
            pessoaTelefone.setTipo(i);
            pessoaTelefone.setTelefone("44997597239"+ i);
            pessoaTelefoneList.add(pessoaTelefone);
        }
        p.setPessoaTelefoneList(pessoaTelefoneList);

        return p;
    }
}
