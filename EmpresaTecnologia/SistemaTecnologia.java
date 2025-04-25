package EmpresaTecnologia;

import java.util.Scanner;

public class SistemaTecnologia {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do 1º funcionário:");
        funcionario.setNome(sc.next());

        System.out.println("Digite a matrícula do 1º funcionário:");
        funcionario.setMatricula(sc.nextInt());

        System.out.println("Digite o salário do 1º funcionário:");
        funcionario.setSalario(sc.nextFloat());

        System.out.println("Informações do 1º funcionário:");
        System.out.println(funcionario);

        Funcionario funcionario2 = new Funcionario();

        System.out.println("Digite o nome do 2º funcionário:");
        funcionario2.setNome(sc.next());

        System.out.println("Digite a matrícula do 2º funcionário:");
        funcionario2.setMatricula(sc.nextInt());

        System.out.println("Digite o salário do 2º funcionário:");
        funcionario2.setSalario(sc.nextFloat());

        System.out.println("Informações do 2º funcionário:");
        System.out.println(funcionario2);
    }
}
