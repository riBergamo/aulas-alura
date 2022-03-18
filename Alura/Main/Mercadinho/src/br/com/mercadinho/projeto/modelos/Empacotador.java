package br.com.mercadinho.projeto.modelos;

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
