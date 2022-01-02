package com.testelib.service;

import com.testelib.model.Pessoa;
import com.testelib.repository.PessoaRepository;

public class PessoaService {


    PessoaRepository pessoaRepository = new PessoaRepository();

    public void save(Pessoa p){
        pessoaRepository.save(p);
    }

    public void save(Pessoa p, String db){
        pessoaRepository.save(p,db);
    }
}
