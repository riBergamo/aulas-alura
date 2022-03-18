package br.com.natal.projeto.natal;

import br.com.natal.projeto.crianca.Crianca;

import java.util.Scanner;

public class Natal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Crianca crianca = new Crianca();

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual seu nome? ");
            String nome = scanner.next();
            System.out.println("Você foi uma criança boazinha ou foi malvada? ");
            String personalidade = scanner.next();

            crianca.nomeDaCrianca(nome);
            crianca.personalidadeDaCrianca(personalidade);
        }

        System.out.println("Quantidade de presentes entregues: "
                + crianca.getPresentesEntregues());
        System.out.println("Quantidade de presentes não entregues: "
                + crianca.getPresentesNaoEntregues());
    }
}
