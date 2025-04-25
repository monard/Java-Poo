package ClinicaMedica;

import java.util.Scanner;

public class SistemaClinica {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Clinica clinica1 = new Clinica();

        System.out.println("Qual nome do 1º cliente? ");
        clinica1.setNomeCliente(sc.next());

        System.out.println("Qual CPF do 1º cliente? ");
        clinica1.setCpf(sc.next());

        System.out.println("Qual e-mail do 1º cliente? ");
        clinica1.setEmail(sc.next());

        System.out.println(clinica1.toString());

        Clinica clinica2 = new Clinica();

        System.out.println("Qual nome do 2º cliente? ");
        clinica2.setNomeCliente(sc.next());

        System.out.println("Qual CPF do 2º cliente? ");
        clinica2.setCpf(sc.next());

        System.out.println("Qual e-mail do 2º cliente? ");
        clinica2.setEmail(sc.toString());

        System.out.println(clinica2.toString());

        Clinica clinica3 = new Clinica();

        System.out.println("Qual nome do 3º cliente? ");
        clinica1.setNomeCliente(sc.next());

        System.out.println("Qual CPF do 3º cliente? ");
        clinica3.setCpf(sc.next());

        System.out.println("Qual e-mail do 3º cliente? ");
        clinica3.setEmail(sc.toString());

        System.out.println(clinica3.toString());

        Clinica clinica4 = new Clinica();

        System.out.println("Qual nome do 4º cliente? ");
        clinica4.setNomeCliente(sc.next());

        System.out.println("Qual CPF do 4º cliente? ");
        clinica4.setCpf(sc.next());

        System.out.println("Qual e-mail do 4º cliente? ");
        clinica4.setEmail(sc.toString());

        System.out.println(clinica4.toString());
    }
}
