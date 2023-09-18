package Service;

import Interface.Discador;

public class DiscadorImpl implements Discador {

    public void atender(){
        System.out.println("Chamada atendida...");
    }
    public void iniciarCorreiorVoz(){
        System.out.println("Ligando para correio de voz...");
    }
    public void ligar(){
        System.out.println("Ligando....");
    }
}
