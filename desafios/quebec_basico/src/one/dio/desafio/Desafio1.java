package one.dio.desafio;

public class Desafio1 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 11, 13, 18, 34 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
