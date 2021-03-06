package br.com.alura.projeto.exercicios;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(altura);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();// + ", Idade: " + getIdade() + ", Altura: " + getAltura();
    }
}
