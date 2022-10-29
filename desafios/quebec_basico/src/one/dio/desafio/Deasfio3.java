package one.dio.desafio;

import java.util.Scanner;
import java.util.ArrayList;

public class Deasfio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        int max = 10;
        ArrayList<Integer> arr = new ArrayList<>(max);
        int aux = 0;
        for (int i = 0; i < max; i++) {
            arr.add(aux);
            aux++;
            if (aux == t) {
                aux = 0;
            }
            System.out.println("N[" + i + "] = " + arr.get(i));
        }

        leitor.close();
    }
}
