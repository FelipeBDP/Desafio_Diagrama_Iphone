package Service;

import Interface.Navegador;

public class NavegadorImpl implements Navegador {

    public void adicionarNovaAba() {
        System.out.println("Abrindo Nova Aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo Página... ");
    }
}
