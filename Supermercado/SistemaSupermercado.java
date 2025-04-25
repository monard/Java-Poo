package Supermercado;

import java.util.Scanner;

public class SistemaSupermercado {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Produto produto = new Produto();

        System.out.println("Qual o nome do 1º Produto?");
        produto.setNomeprod(sc.next());

        System.out.println("Qual o preço do 1º Produto?");
        produto.setPreco(sc.nextFloat());

        System.out.println("Qual a quantidade do 1º Produto?");
        produto.setQuantidade(sc.nextInt());

        System.out.println("O detalhamento do 1° Produto ");
        System.out.println(produto);

        Produto produto2 = new Produto();

        System.out.println("Qual o nome do 2º Produto?");
        produto2.setNomeprod(sc.next());

        System.out.println("Qual o preço do 2º Produto?");
        produto2.setPreco(sc.nextFloat());

        System.out.println("Qual a quantidade do 2º Produto?");
        produto2.setQuantidade(sc.nextInt());

        System.out.println("O detalhamento do 2° Produto ");
        System.out.println(produto2);
    }
}
