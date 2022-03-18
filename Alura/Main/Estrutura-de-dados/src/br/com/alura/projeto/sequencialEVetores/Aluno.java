package br.com.alura.projeto.sequencialEVetores;

public class Aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;//"transforma" o 'obj' de Object em Alunos pra poder usar o getNome()
        return outro.getNome().equals(this.nome);//compara o nome da classe Alunos com o nome dessa classe
    }

    @Override
    public String toString() {
        return nome;
    }
}
