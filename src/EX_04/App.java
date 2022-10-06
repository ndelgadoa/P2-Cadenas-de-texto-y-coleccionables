package EX_04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase = scn.nextLine();
        System.out.println("Escriba un caracter");
        String a = scn.nextLine();
        int i = 0;
        for (i = 0; i < frase.length(); i++) {
            int valor = frase.indexOf(a, i);
            if (valor == -1) break;
            System.out.println(valor);
            i = valor;

        }

    }
}
