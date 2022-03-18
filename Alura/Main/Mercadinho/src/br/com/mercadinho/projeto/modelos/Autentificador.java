package br.com.mercadinho.projeto.modelos;
//a utentifica
public class Autentificador {
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
        String aprOuNaoApr = senha.length() >= 6?"Senha aprovada":"Senha não aprovada";
        System.out.println(aprOuNaoApr);
    }

    public boolean autentifica(String senha) {
        if (this.senha.equals(senha)){
            System.out.println("Senha correta");
            return true;
        } else {
            System.out.println("Senha incorreta");
            return false;
        }
    }
}
