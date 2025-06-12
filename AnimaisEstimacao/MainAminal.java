package AnimaisEstimacao;

import java.util.ArrayList;

import java.util.Scanner;

public class MainAminal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Animais> animail = new ArrayList<>();

        animail.add(new cachorro("Jack Russell Terrier", 12, "Caramelo"));
        animail.add(new gato("Batman", 2, "preto"));
        animail.add(new passaro("Zé", 1, "amarelo"));

        for (Animais A : animail) {
            A.exibirInformacao();
            A.emitiSom();
            A.comer();
        }
    }
}