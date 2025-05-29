package CarroPoo;

import java.util.Scanner;

public class SistemaCarro {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Carro[] C = new Carro[3];

        for (int i=0; i<3;i++) {
            System.out.println("=== Cadastro do"+" "+ (1 + i) + " Carro" + "====");

            Carro carro = new Carro();

            System.out.println("Qual o Marca do carro?");
            carro.setMarca(sc.next());
            System.out.println("Qual o modelo do carro?");
            carro.setModelo(sc.next());
            System.out.println("Qual o Ano do carro?");
            carro.setAno(sc.nextInt());

            C[i] = carro;
        }
        System.out.println("\n=== Lista de carro cadastrado===");
        for (int i=0;i<C.length;i++){
            System.out.println((i+1)+"-"+"Carro"+"="+C[i]);
        }

        }
    }

