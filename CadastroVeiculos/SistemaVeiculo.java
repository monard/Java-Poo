package CadastroVeiculos;

import java.util.Scanner;

public class SistemaVeiculo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Criar o primeiro Objeto
        Veiculos veiculos1= new Veiculos();


        System.out.println( //Escolha do Veiculo
                "Escolha qual o modelo do Veiculo: " +
                        "\n1- Carro"+
                        "\n2- Moto"+
                        "\n3- Caminhão");
        int escolha=sc.nextInt();

        String tipoVeiculo;
        switch (escolha) { //opções
            case 1:  // Carro
                tipoVeiculo = "Carro";
                break;
            case 2:  // Moto
                tipoVeiculo = "Moto";
                break;
            case 3:  // Caminhão
                tipoVeiculo = "Caminhão";
                break;
            default:
                System.out.println("Opção inválida.");
                return; // Sai do programa se a opção for inválida
        }

        veiculos1.setModeloVeiculo(tipoVeiculo);

        System.out.println("Qual a Placa do 1º Veiculo ");
        veiculos1.setPlaca(sc.next());

double kmdigitado ;
    do{
        System.out.println("Qual a KM do 1º Veiculo");
        kmdigitado= sc.nextDouble();
        if (kmdigitado<=0) {
            System.out.println("O valor NAO pode ser negativo!!");
        }
    }
    while (kmdigitado<=0);
    veiculos1.setKm(kmdigitado);

        System.out.println(veiculos1.toString());

        Veiculos veiculos2= new Veiculos();

        System.out.println("Qual o Modelo do 2º Veiculo?");
        veiculos2.setModeloVeiculo(sc.next());

        System.out.println("Qual a Placa do 2º Veiculo ");
        veiculos2.setPlaca(sc.next());
     do {
         System.out.println("Qual a KM do 2º Veiculo");
         kmdigitado = sc.nextDouble();
         if (kmdigitado <= 0) {
             System.out.println("O valor NAO pode ser negativo!!");
         }
     }while (kmdigitado<=0);
     veiculos2.setKm(kmdigitado);
        veiculos2.setKm(sc.nextDouble());

        System.out.println(veiculos2.toString());

    }
}
