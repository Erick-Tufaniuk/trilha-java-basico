package desafios.poo.desafioIphone;


public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void ligarAparelho(){
        System.out.println("Ligando aparelho");
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar(){
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica: " + musica);
    }

    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo pagina: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

    
}