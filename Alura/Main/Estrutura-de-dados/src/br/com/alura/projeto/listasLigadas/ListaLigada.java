package br.com.alura.projeto.listasLigadas;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    public void addNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            this.primeira = this.ultima;
        }

        this.totalDeElementos++;
        
    }

    public void add(Object elemento){


    }

    public void add(int posicao, Object elemento) {}

    public Object pega(int posicao) {return null;}

    public void remove (int posicao) {}

    public int tamanho() {return 0;}

    public boolean contem(Object o) {return false;}

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");

            atual = atual.getProximo();
        }

        builder.append("]");
        return builder.toString();
    }

}
