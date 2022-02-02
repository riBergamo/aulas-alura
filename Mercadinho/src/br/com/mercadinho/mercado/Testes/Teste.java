package br.com.mercadinho.mercado.Testes;

import br.com.mercadinho.mercado.modelos.Caixa;
import br.com.mercadinho.mercado.modelos.Empacotador;
import br.com.mercadinho.mercado.modelos.Gerente;

public class Teste {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        System.out.println("-----------Caixa-----------");
        caixa.setNome("Maria Da Silva");
        caixa.setCpf("352-265-897-55");

        System.out.println("Nome:        " + caixa.getNome());
        System.out.println("Cpf:         " + caixa.getCpf());
        System.out.println("Bonificação: " + caixa.getBonifcação());
        System.out.println("Salário:     " + caixa.getSalario());

        Gerente gerente = new Gerente();
        System.out.println("----------Gerente----------");
        gerente.setSenha("4555");

        System.out.println("Bonificação:  " + gerente.getBonifcação());
        System.out.println("Salário:      " + gerente.getSalario());

        Empacotador empacotador = new Empacotador();
        System.out.println("--------Empacotador--------");

        System.out.println("Bonificação:  " + empacotador.getBonifcação());
        System.out.println("Salário:      " + empacotador.getSalario());


    }
}
