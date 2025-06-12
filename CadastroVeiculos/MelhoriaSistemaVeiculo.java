package CadastroVeiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MelhoriaSistemaVeiculo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Veiculos> listaVeiculos = new ArrayList<>(); //inicio do array

        System.out.print("Quantos veículos deseja cadastrar? ");
        int totalVeiculos = sc.nextInt();

        for (int i = 1; i <= totalVeiculos; i++) { //FOR verificar a quantidade que se deve repetir
            System.out.printf("%n--- Cadastro do %dº Veículo ---\n", i); // %dº -> digitando o numero de forma crescente

            Veiculos veiculo = new Veiculos();

            String tipoVeiculo ="";
            boolean opcaoValida = false;
            while (!opcaoValida) {

            System.out.println("Escolha o modelo do Veículo: " +
                    "\n1- Carro" +
                    "\n2- Moto" +
                    "\n3- Caminhão");

                int escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        tipoVeiculo = "Carro";
                        opcaoValida = true;
                        break;
                    case 2:
                        tipoVeiculo = "Moto";
                        opcaoValida = true;
                        break;
                    case 3:
                        tipoVeiculo = "Caminhão";
                        opcaoValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida!! Tente novamente");
                }
            }

            veiculo.setModeloVeiculo(tipoVeiculo);

            System.out.printf("Qual a placa do %dº veículo? ", i);
            veiculo.setPlaca(sc.next());

            double kmDigitado;
            do {
                System.out.printf("Qual a KM do %dº veículo? ", i);
                kmDigitado = sc.nextDouble();
                if (kmDigitado <= 0) {
                    System.out.println("O valor NÃO pode ser negativo ou zero!");
                }
            } while (kmDigitado <= 0);

            veiculo.setKm(kmDigitado);
            listaVeiculos.add(veiculo);
        }

        // Exibe todos os veículos cadastrados
        System.out.println("\n=== Lista de Veículos Cadastrados ===");
        for (int i = 0; i < listaVeiculos.size(); i++) {
            System.out.printf("%dº Veículo -> %s%n", i + 1, listaVeiculos.get(i));
        }
    }
}

