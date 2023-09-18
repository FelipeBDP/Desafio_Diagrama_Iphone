import Interface.Discador;
import Interface.Navegador;
import Interface.Player;
import Service.DiscadorImpl;
import Service.NavegadorImpl;
import Service.PlayerImpl;

public class iphone {

    public static void main(String[] args) {
        Discador aparelhoTelefonico = new DiscadorImpl();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreiorVoz();

        Navegador navegadorInternet = new NavegadorImpl();
        
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

        Player repodutorMusicial = new PlayerImpl();

        repodutorMusicial.tocar();
        repodutorMusicial.pausar();
        repodutorMusicial.selecionarMusica();
    }
}
