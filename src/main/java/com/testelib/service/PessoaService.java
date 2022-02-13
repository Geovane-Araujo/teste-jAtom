package com.testelib.service;

import com.jatom.enuns.JAtomTypes;
import com.jatom.model.JAtomParameters;
import com.testelib.model.Pessoa;
import com.testelib.repository.PessoaRepository;

import java.util.Hashtable;

public class PessoaService {


    PessoaRepository pessoaRepository = new PessoaRepository();

    public void save(Pessoa p) throws Exception {
        pessoaRepository.save(p);
    }

    public void save(Pessoa p, String db) throws Exception {
        pessoaRepository.save(p,db);
    }

    public void get() throws Exception {
        JAtomParameters jp = new JAtomParameters();
        jp.put(JAtomTypes.SQL, "select * from pessoa");
        Object o = pessoaRepository.get(jp);
        System.out.println(o.toString());
    }
}
