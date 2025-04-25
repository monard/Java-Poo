package SistemaEscola;


import java.util.Scanner;

public class Sistema {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Escola escola1 = new Escola();
        Escola escola2 = new Escola();
        Escola escola3 = new Escola();

        System.out.println("Qual o nome do 1º aluno? ");
        escola1.setAluno(sc.next());

        System.out.println("Qual o nome do 2º aluno? ");
        escola2.setAluno(sc.next());

        System.out.println("Qual o nome do 3º aluno? ");
        escola3.setAluno(sc.next());

        System.out.println("Qual a idade do 1º Aluno? ");
        escola1.setIdade(sc.nextInt());

        System.out.println("Qual a idade do 2º Aluno? ");
        escola2.setIdade(sc.nextInt());

        System.out.println("Qual a idade do 3º Aluno? ");
        escola3.setIdade(sc.nextInt());

        System.out.println("Qual a nota do 1º Aluno");
        escola1.setNota(sc.nextFloat());

        System.out.println("Qual a nota do 2º Aluno");
        escola2.setNota(sc.nextFloat());

        System.out.println("Qual a nota do 3º Aluno");
        escola3.setNota(sc.nextFloat());

        System.out.println(escola1.toString());
        System.out.println(escola2.toString());
        System.out.println(escola3.toString());
    }
}
