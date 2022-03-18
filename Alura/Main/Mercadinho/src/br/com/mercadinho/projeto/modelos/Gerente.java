package br.com.mercadinho.projeto.modelos;

public class Gerente extends Funcionarios implements Autentificavel {
    private Autentificador autentificador;

    public Gerente() {
        this.autentificador = new Autentificador();
    }

    @Override
    public double getBonifcação() {
        return getSalario() + (getSalario()/10);
    }

    @Override
    public double getSalario() {
        return 2500.00;
    }

    @Override
    public void setSenha(String senha) {
        this.autentificador.setSenha(senha);
    }

    @Override
    public boolean autentifica(String senha) {
        return this.autentificador.autentifica(senha);
    }
}
