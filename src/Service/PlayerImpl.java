package Service;

import Interface.Player;

public class PlayerImpl implements Player {

    public void tocar() {
        System.out.println("Iniciando música...");
    }

    public void pausar() {
        System.out.println("Pausando música ...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando a música ...");
    }
}
