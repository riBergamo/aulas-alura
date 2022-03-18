package br.com.alura.projeto.sequencialEVetores;

public class TesteVetor {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");
        Aluno a3 = new Aluno("Maria");

        //List<br.com.alura.projetos.sequencialEVetores.Aluno> lista = new ArrayList<>();

        Vetor lista = new Vetor();

        lista.add(a1);
        lista.add(a2);

        /*System.out.println(lista);
        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a3));
        System.out.println(lista.pego(20));*/

        lista.add(a3, 1);
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        for (int i = 0;i <= 30; i++) {
            Aluno y = new Aluno("João" + i);
            lista.add(y);
        }

        System.out.println(lista);
    }
}
