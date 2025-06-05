package AnimaisEstimacao;

import java.util.ArrayList;

import java.util.Scanner;

public class MainAminal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       ArrayList<Animais> animail = new ArrayList<>();

        animail.add(new cachorro("Jack Russell Terrier",12,"Caramelo"));
        animail.add(new gato("Batman",2,"preto"));
        animail.add(new passaro("Zé",1,"amarelo"));


        for (Animais A : animail) {
            A.exibirInformacao();
            A.emitiSom();
            A.comer();
        }
        Animais animal = new cachorro();
        System.out.println("Registre um cachorro:");
        System.out.println("Digite o nome do cachorro");
        animail.setNome(sc.next());
        System.out.println("Digite a idade do cachorro:");
        animail.setIdade(sc.nextInt());
        System.out.println("Digite a raca do cachorro:");
        animail.seraca = sc.next();

        animal=new cachorro(animail.getNome(),animail.getIdade,raca);

    }
    Animais animal = new cachorro();
}
