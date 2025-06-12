package Telefone;

import java.util.Scanner;

public class SistemaTelefonia {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TelefoneCelular telefoneCelular = new TelefoneCelular();

        System.out.println("Qual a Marca do Telefone?");
        telefoneCelular.setMarca(sc.next());

        System.out.println("Qual a Modelo do Telefone?");
        telefoneCelular.setModelo(sc.next());

        System.out.println("Qual a Preço do Telefone?");
        telefoneCelular.setPreco(sc.nextDouble());

        System.out.println("Qual a Memoria do Telefone?");
        telefoneCelular.setMemoria(sc.nextDouble());

        System.out.println(telefoneCelular.toString());
    }

}
