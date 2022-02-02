package br.com.JogoDaVelha;

import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private int rodada = 1;
    private int vez = 1;
    private Jogador jogador1;
    private Jogador jogador2;
    Scanner scanner = new Scanner(System.in);

    public Jogo() {
        tabuleiro = new Tabuleiro();
        iniciarJogadores();

        while (Jogar());
    }

    public void iniciarJogadores() {

        System.out.println("Primeiro jogador: ");
        if (escolherJogador() == 1) {
            this.jogador1 = new JogadorHumano(1);
        } else {
            this.jogador1 = new JogadorComputador(1);
        }

        System.out.println("Segundo jogador: ");
        if (escolherJogador() == 1) {
            this.jogador2 = new JogadorHumano(2);
        } else {
            this.jogador2 = new JogadorComputador(2);
        }
    }

    private int escolherJogador() {
        int opcao = 0;

        do {
            System.out.println("1. Humano");
            System.out.println("2. Computador");
            System.out.println("Opção: ");
            opcao = scanner.nextInt();
            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Tente novamente ");
            }
        } while (opcao != 1 && opcao != 2);
        return opcao;
    }

    public boolean Jogar() {
        if (ganhou() == 0) {
            System.out.println();
            System.out.println("Rodada " + rodada);
            System.out.println("Vez do jogador " + getVez());

            if (getVez() == 1) {
                jogador1.Jogar(tabuleiro);
            } else {
                jogador2.Jogar(tabuleiro);
            }

            if (tabuleiro.tabuleiroCompleto()) {
                System.out.println("Empate");
                return false;
            }

            vez++;
            rodada++;
        }
        return true;
    }

    public int getVez() {
        if (vez%2 == 1) {
            return 1;
        }
        return 2;
    }

    public int ganhou() {
        if (tabuleiro.checaLinhas() == 1) {
            return 1;
        }
        if (tabuleiro.checaColunas() == 1) {
            return 1;
        }
        if (tabuleiro.checaDiagonais() == 1) {
            return 1;
        }

        if (tabuleiro.checaLinhas() == -1) {
            return -1;
        }
        if (tabuleiro.checaColunas() == -1) {
            return -1;
        }
        if (tabuleiro.checaDiagonais() == -1) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Jogo da velha";
    }

}
