package ProdutoPoo;
import java.util.Scanner;
    public class SistemaProduto {
        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            Produto[] A = new Produto[2];

            for (int i=0; i<2;i++) {
                System.out.println("=== Cadastro do"+" "+ (1 + i) + " Produto" + "====");

                Produto Produto = new Produto();

                System.out.println("Qual o Nome do Produto?");
                Produto.setNome(sc.next());
                System.out.println("Qual o Preco do Produto?");
                Produto.setPreco(sc.nextDouble());

                A[i] = Produto;
            }
            System.out.println("\n=== Lista de Produto cadastrado===");
            for (int i=0;i<A.length;i++){
                System.out.println((i+1)+"-"+"Produto"+"="+A[i]);
            }

        }
    }
