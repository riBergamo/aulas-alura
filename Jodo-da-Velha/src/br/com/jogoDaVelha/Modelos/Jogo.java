package br.com.jogoDaVelha.Modelos;

import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private int rodada = 1;
    private int vez = 1;
    private Jogador jogador1;
    private Jogador jogador2;
    public Scanner scanner = new Scanner(System.in);

    public Jogo() {
        tabuleiro = new Tabuleiro();
        iniciarJogadores();

        while (Jogar());
    }

    public void iniciarJogadores() {
        if (escolherJogador() == 1) {
            this.jogador1 = new JogadorHumano(1);
        } else {
            this.jogador1 = new JogadorComputador(2);
        }

        if (escolherJogador() == 2) {
            this.jogador2 = new JogadorHumano(2);
        } else {
            this.jogador2 = new JogadorComputador(1);
        }
    }

    private int escolherJogador() {
        int opcao = 0;

        do {
            System.out.println("1. X");
            System.out.println("2. O\n");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Tente novamente ");
            }
        } while (opcao != 1 && opcao != 2);

        return opcao;
    }

    public boolean Jogar() {
        if (ganhou() == 0) {
            System.out.println("\n-----Rodada " + rodada + "-----");
            System.out.println("Vez do jogador " + getVez());

            if (getVez() == 1) {
                jogador1.Jogar(tabuleiro);
            } else {
                jogador2.Jogar(tabuleiro);
            }

            if (tabuleiro.tabuleiroCompleto()) {
                System.out.println("\nEmpate");
                return false;
            }

            vez++;
            rodada++;

            return true;
        } else {

            if (ganhou() == -1) {
                System.out.println("O primeiro Jogador VENCEU!");
            } else {
                System.out.println("O segundo Jogador VENCEU!");
            }

            return false;
        }
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
        return "Jogo";
    }

}
