package br.com.mercadinho.mercado.modelos;

public abstract class Funcionarios {
    private String nome;
    private double salario;
    private String cpf;

    public abstract double getBonifcação();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
