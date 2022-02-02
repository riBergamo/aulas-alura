package br.com.JogoDaVelha;

import java.util.Arrays;

public class Tabuleiro {
    private int[][] tabuleiro = new int[3][3];

    public void Tabuleiro() {
        zerarTabuleiro();
    }

    //pra ficar os espacos(linhas e colunas) em "branco"
    public void zerarTabuleiro() {
        for (int linhas = 0;linhas < 3; linhas++) {
            for (int colunas = 0; colunas < 3; colunas++) {
                tabuleiro[linhas][colunas] = 0;
            }
        }
    }

    public void exibeTabuleiro() {
        System.out.println();
        for (int linhas = 0; linhas < 3; linhas++) {
            System.out.println();
            for (int colunas = 0; colunas < 3; colunas++) {
                if (tabuleiro[linhas][colunas] == -1) {
                    System.out.print("X");
                }
                if (tabuleiro[linhas][colunas] == 1) {
                    System.out.print("O");
                }
                if (tabuleiro[linhas][colunas] == 0) {
                    System.out.print(" ");
                }
                if (colunas == 0 || colunas == 1) {
                    System.out.print("|");
                }
            }
        }
        System.out.println();
    }

    public int getPosicao(int[] tentativa) {
        return tabuleiro[tentativa[0]] [tentativa[1]];
    }

    public void setPosicao(int[] tentativa, int jogador) {
        if (jogador == 1) {
            tabuleiro[tentativa[0]][tentativa[1]] = -1;
        } else {
           tabuleiro[tentativa[0]][tentativa[1]] = 1;
        }
        exibeTabuleiro();
    }

    public int checaLinhas() {
        for (int linhas = 0; linhas < 3; linhas++) {
            if (tabuleiro[linhas][0] + tabuleiro[linhas][1] + tabuleiro[linhas][2] == -3) {
                return -1;
            }
            if (tabuleiro[linhas][0] + tabuleiro[linhas][1] + tabuleiro[linhas][2] == 3) {
                return 1;
            }
        }
        return 0;
    }

    public int checaColunas() {
        for (int colunas = 0; colunas < 3; colunas++) {
            if (tabuleiro[0][colunas] + tabuleiro[1][colunas] + tabuleiro[2][colunas] == -3) {
                return -1;
            }
            if (tabuleiro[0][colunas] + tabuleiro[1][colunas] + tabuleiro[2][colunas] == 3) {
                return 1;
            }
        }
        return 0;
    }

    public int checaDiagonais() {
        if (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == -3) {
            return -1;
        }
        if (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == 3) {
            return 1;
        }
        if (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0] == -3) {
            return -1;
        }
        if (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0] == 3) {
            return 1;
        }
        return 0;
    }

    public boolean tabuleiroCompleto() {
        for (int linhas = 0; linhas < 3; linhas++) {
            for (int colunas =0; colunas < 3; colunas++) {
                if (tabuleiro[linhas][colunas] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tabuleiro";
    }
}
