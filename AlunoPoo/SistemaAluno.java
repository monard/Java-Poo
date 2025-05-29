package AlunoPoo;
import java.util.Scanner;
public class SistemaAluno {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Aluno[] A = new Aluno[4];

        for (int i=0; i<4;i++) {
            System.out.println("=== Cadastro do"+" "+ (1 + i) + " Aluno" + "====");

            Aluno aluno = new Aluno();

            System.out.println("Qual o Nome do Aluno?");
            aluno.setNome(sc.next());
            System.out.println("Qual o modelo do Aluno?");
            aluno.setmatricula(sc.nextInt());
            System.out.println("Qual o nota final do Aluno?");
            aluno.setNota(sc.nextDouble());

            A[i] = aluno;
        }
        System.out.println("\n=== Lista de Aluno cadastrado===");
        for (int i=0;i<A.length;i++){
            System.out.println((i+1)+"-"+"Aluno"+"="+A[i]);
        }

    }
}