package PessoaPoo;

import java.util.Scanner;

public class SistemaPessoa {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];

        for (int i = 0; i <= 2; i++) {
            System.out.println("=== Cadastro do Pessoas " + (i + 1) + " ===");

            Pessoa pessoa = new Pessoa();

            System.out.println("Qual o seu Nome?");
            pessoa.setNome(sc.next());

            System.out.println("Qual a seu Idade?");
            pessoa.setIdade(sc.nextInt());

            pessoas[i]=pessoa;
        }
        System.out.println("\n=== Lista de Clientes Cadastrados ===");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Cliente " + (i + 1) + ": " + pessoas[i]);
        }
    }
}
