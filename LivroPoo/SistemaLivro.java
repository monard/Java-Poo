package LivroPoo;

import PessoaPoo.Pessoa;

import java.util.Scanner;

public class SistemaLivro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       Livro[] l = new Livro[3];

        for (int i = 0; i <= 3; i++) {
            System.out.println("=== Cadastro do Livros " + (i + 1) + " ===");

            Livro livros = new Livro();

            System.out.println("Qual o titulo do livro?");
            livros.setTitulo(sc.next());

            System.out.println("Qual autor do Livro?");
           livros.setAutor(sc.next());

            System.out.println("Qual o ano de publicação?");
            livros.setAnoDePublicação(sc.nextInt());

            l[i]=livros;
        }
        System.out.println("\n=== Lista de Clientes Cadastrados ===");
        for (int i = 0; i < l.length; i++) {
            System.out.println("Cliente " + (i + 1) + ": " + l[i]);
        }
    }
}
