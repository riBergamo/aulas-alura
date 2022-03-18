package br.com.alura.projeto.listasLigadas;

public class TestaListaligada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.addNoComeco("Mauricio");
        System.out.println(lista);
        lista.addNoComeco("Paulo");
        System.out.println(lista);
        lista.addNoComeco("Guilherme");
        System.out.println(lista);
    }
}
