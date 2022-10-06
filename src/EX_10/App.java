package EX_10;

import java.util.*;

public class App {

            public static void main(String[] args) {
                Map<Integer, Integer> mapa = new HashMap<>();
                mapa.put(2, 1020);
                mapa.put(3, 300);
                mapa.put(1, 100);
                mapa.put(5, 500);
                mapa.forEach((k, v) -> System.out.println(k + "=" + v));
                System.out.println("Despues de ordenar por valor");
                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mapa.entrySet());
                list.sort(Map.Entry.comparingByValue());
                list.forEach(System.out::println);
            }
        }

