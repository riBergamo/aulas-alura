package br.com.mercadinho.projeto.Testes;

import br.com.mercadinho.projeto.modelos.Autentificavel;
import br.com.mercadinho.projeto.modelos.Gerente;

public class TesteAutentificador {
    public static void main(String[] args) {
        Autentificavel gerente = new Gerente();
        gerente.setSenha("JoãoLindão");
        gerente.autentifica("JoãoLindão");

    }
}
