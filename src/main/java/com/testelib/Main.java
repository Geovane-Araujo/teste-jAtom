package com.testelib;

import com.testelib.model.Pessoa;
import com.testelib.model.PessoaTelefone;
import com.testelib.repository.PessoaRepository;
import com.testelib.service.PessoaService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args){

        PessoaRepository pessoaRepository = new PessoaRepository();
        Pessoa p = loadData();

        PessoaService pessoaService = new PessoaService();

        // pessoaService.save(p);
        // System.out.println(p.toString());

        // pessoaService.get();

        Object obj = pessoaRepository.getByID(Pessoa.class, 32);
        System.out.println(obj.toString());
    }


    public static Pessoa loadData(){

        Pessoa p = new Pessoa();

        // dados da pessoa
        p.setNome("Stefanny Naara Araújo " + UUID.randomUUID().toString());
        p.setIdade(27);

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
