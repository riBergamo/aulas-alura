package br.com.mercadinho.mercado.modelos;

public class Caixa extends Funcionarios {

    @Override
    public double getBonifcação() {
        return getSalario() + (getSalario()/25);
    }

    @Override
    public double getSalario() {
        return 1600.00;
    }
}
