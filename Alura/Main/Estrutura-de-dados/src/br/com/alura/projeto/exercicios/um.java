package br.com.alura.projeto.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class um {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("João");

        Pessoa p2 = new Pessoa();
        p2.setNome("Riane");

        Pessoa p3 = new Pessoa();
        p3.setNome("Ana");

        List<Pessoa> list = new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Pessoa elementoEspecifico = (Pessoa) list.get(1);

        System.out.println(elementoEspecifico);
        System.out.println("");

        System.out.println(list);

        System.out.println(p1.getNome().equals(p2.getNome()));


        //para comparar e ordenar a lista em ordem alfabetica
        list.sort(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                String nomeP1 = p1.getNome();
                String nomeP2 = p2.getNome();
                return nomeP1.compareToIgnoreCase(nomeP2);
            }
        }
        );

        //pra deixar a lista bonitinha, cada elemento um embaixo do outro
        for (Pessoa pessoa : list) {
            System.out.println(pessoa);
        }
    }
}
