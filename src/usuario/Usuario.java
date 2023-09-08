package usuario;

import iphone.equipamentosDisruptivos.Iphone;

public class Usuario {
    static Iphone meuIphone = new Iphone();
    
    public static void main(String[] args) {
        meuIphone.realizarLigacao();
        meuIphone.exibirPagina();
        meuIphone.reproduzirMusiuca();
        //todos os outros métodos da classe...



    }
}
