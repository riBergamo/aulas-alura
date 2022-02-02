package br.com.mercadinho.mercado.modelos;

public class Empacotador extends Funcionarios {

    @Override
    public double getBonifcação() {
        return getSalario() + (getSalario()/30);
    }

    @Override
    public double getSalario() {
        return 1200.00;
    }
}
