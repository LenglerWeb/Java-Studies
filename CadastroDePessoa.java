package com.youtube.jovemtranquilao.orientacaoAObjetos;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CadastroDePessoa {

    ArrayList<Pessoa> pessoaList = new ArrayList<>();

    Maternidade maternidade = new Maternidade();

    public static void main(String[] args) throws ParseException {
        new CadastroDePessoa().rodar();

    }

    private void rodar() throws ParseException {
        Pessoa zumba = maternidade.nascer("Zumba Games", "Masculino");
        Pessoa zefrina = maternidade.nascer("Zefrina Silva", "Feminino");
        Pessoa joao = maternidade.nascer("Joao Games", "Masculino");
        Pessoa robo = maternidade.nascer("Robô Android", "Humanoide");

        ArrayList<Pessoa> homemList = new ArrayList<>();
        ArrayList<Pessoa> mulherList = new ArrayList<>();
        ArrayList<Pessoa> outrosGeneros = new ArrayList<>();

        pessoaList.add(zumba);
        pessoaList.add(zefrina);
        pessoaList.add(joao);

        for (Pessoa pessoa : pessoaList) {
            if (pessoa.getSexo().equals("Masculino")) {
                homemList.add(pessoa);
            } else if (pessoa.getSexo().equals("Feminino")) {
                mulherList.add(pessoa);
            } else {
                outrosGeneros.add(pessoa);
            }
        }

        System.out.println("");
    }
}
