package EX_08;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> lambda = new ArrayList<>();

        lambda.add("hola");
        lambda.add("que");
        lambda.add("hace");
        System.out.print("ArrayList: ");
        lambda.forEach((e) -> {
            System.out.print(e + ", ");
        });
    }
}
