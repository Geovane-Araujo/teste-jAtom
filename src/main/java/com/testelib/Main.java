package com.testelib;


import com.jatom.security.Security;
import com.testelib.model.Pessoa;
import com.testelib.model.PessoaTelefone;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws Exception {

//        MigrationDataBase mig = new MigrationDataBase();
//        mig.createInformationSchemaIntoSchema();
//        mig.executeMigrationDataBaseResourcesIntoSchema();

//        new Thread(){
//            @Override
//            public void run() {
//                int i = 1;
//                while (i < 500){
//                    PessoaRepository pessoaRepository = new PessoaRepository();
//                    Pessoa p = loadData("1");
//                    pessoaRepository.save(p,"HUB_PLATFORM_001");
//                    i++;
//                }
//            }
//        }.start();
//
//        new Thread(){
//            @Override
//            public void run() {
//                int i = 1;
//                while (i < 500){
//                    PessoaRepository pessoaRepository = new PessoaRepository();
//                    Pessoa p = loadData("2");
//                    pessoaRepository.save(p,"HUB_PLATFORM_002");
//                    i++;
//                }
//            }
//        }.start();

//        new Thread(){
//            @Override
//            public void run() {
//                int i = 1;
//                while (i < 500){
//                    PessoaRepository pessoaRepository = new PessoaRepository();
//                    Pessoa p = loadData("3");
//                    ConnectionDatabase.dbname = "HUB_PLATFORM_003";
//                    pessoaRepository.save(p);
//
//                    i++;
//                }
//            }
//        }.start();
//
//
//        new Thread(){
//            @Override
//            public void run() {
//                int i = 1;
//                while (i < 500){
//                    PessoaRepository pessoaRepository = new PessoaRepository();
//                    Pessoa p = loadData("4");
//                    ConnectionDatabase.dbname = "HUB_PLATFORM_004";
//                    pessoaRepository.save(p);
//                    i++;
//                }
//            }
//        }.start();



        // System.out.println(p.toString());
//        AtomParameters jp = new JAtomParameters();
//        jp.put(JAtomTypes.SQL, "select * from pessoa");
//        System.out.printf(pessoaRepository.get(jp).toString());

        Security sec = new Security();
        String token = sec.generateToken("1055");
        System.out.println(token);
        boolean valid = sec.validToken(token);
        System.out.println(token);


//        Object obj = pessoaRepository.getByID(Pessoa.class, 32);
//        System.out.println(obj.toString());
    }


    public static Pessoa loadData(String schema){

        Pessoa p = new Pessoa();

        // dados da pessoa
        p.setNome("Edna de Souza Bezerra " + schema +" - " + UUID.randomUUID().toString());
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
