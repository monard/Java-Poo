package SistemaDispositivosEletronicos;

import java.util.ArrayList;

public class MainDispositivosEletronicos {
    public static void main(String[] args) {
        ArrayList<DispositivoEletronico> dispositivos = new ArrayList<>();

        dispositivos.add(new Smartphone("Apple", "iPhone 14", "iOS"));
        dispositivos.add(new Televisao("Samsung", "Crystal UHD", 55));
        dispositivos.add(new Notebook("Dell", "Inspiron 15", 16));

        for (DispositivoEletronico dispositivo : dispositivos) {
            dispositivo.ligar();
            dispositivo.executarFuncaoPrincipal();
            dispositivo.exibirStatus();
            dispositivo.desligar();
            dispositivo.executarFuncaoPrincipal();
            System.out.println();
        }
    }
}

