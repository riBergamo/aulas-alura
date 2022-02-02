package br.com.mercadinho.mercado.modelos;
//ve quem pd ser autentificado
public abstract interface Autentificavel {
    public abstract void setSenha(String senha);

    public boolean autentifica(String senha);
}
