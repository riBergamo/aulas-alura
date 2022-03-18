package br.com.natal.projeto.crianca;

import java.util.Scanner;

public class Crianca {
    private String nome;
    private boolean personalidade;
    private int presentesEntregues;
    private int presentesNaoEntregues;

    public void nomeDaCrianca(String nome) {
        this.nome = nome;
    }

    public boolean personalidadeDaCrianca(String personalidade) {
        if (personalidade.equalsIgnoreCase("boazinha")) {
            System.out.println("Entrega o presente");
            presentesEntregues++;
            return true;
        } else {
            System.out.println("Não entrega o presente");
            presentesNaoEntregues++;
            return false;
        }
    }

    public int getPresentesEntregues() {
        return this.presentesEntregues;
    }

    public int getPresentesNaoEntregues() {
        return this.presentesNaoEntregues;
    }
}
