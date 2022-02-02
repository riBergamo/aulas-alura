package br.com.JogoDaVelha;

import java.net.Socket;

public class JogadorComputador extends Jogador {

    public JogadorComputador(int jogador) {
        super(jogador);
        System.out.println("Jogador 'computador' criado!");
    }

    @Override
    public void Jogar(Tabuleiro tabuleiro) {}

    @Override
    public void Tentativa(Tabuleiro tabuleiro) {}
}
