package br.com.mercadinho.mercado.Testes;

import br.com.mercadinho.mercado.modelos.Autentificavel;
import br.com.mercadinho.mercado.modelos.Gerente;

public class TesteAutentificador {
    public static void main(String[] args) {
        Autentificavel gerente = new Gerente();
        gerente.setSenha("JoãoLindão");
        gerente.autentifica("JoãoLindão");

    }
}
