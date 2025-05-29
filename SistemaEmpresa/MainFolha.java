package SistemaEmpresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFolha {
    static Scanner sc = new Scanner(System.in);
    private static String List;

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("nome do projeto?", "Brendo", double salarioBase:800 ));
        funcionarios.add(new Desenvolvedor());
        funcionarios.add(new Estagiario);
        System.out.println("Todos elementos " + List);

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " - Bônus: " + f.calculaBonus());
        }
    }
}
