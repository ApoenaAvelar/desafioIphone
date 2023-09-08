package iphone.equipamentosDisruptivos;

import iphone.funcoesBasicas.ReprodutorMusical;
import iphone.funcoesBasicas.NavegadorInternet;
import iphone.funcoesBasicas.Telefone;

public class Iphone implements ReprodutorMusical, NavegadorInternet, Telefone {

  
    public void realizarLigacao() {
        System.out.println("REALIZANDO LIGAÇÃO");
       
    }

   
    public void atenderLigacao() {
       System.out.println("ATENDENDO LIGAÇÃO");
    }

   
    public void IniciarCorreioVoz() {
        System.out.println("INICIUANDO CORREIO DE VOZ");
    }

  
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

  
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

   
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    
    public void reproduzirMusiuca() {
       System.out.println("REPRODUZINDO A MÚSICA");
    }

    
    public void pausarMusica() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    
    public void selecionarMusica() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

}
