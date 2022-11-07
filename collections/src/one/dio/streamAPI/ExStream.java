package one.dio.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class ExStream {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "5", "1", "6", "3", "8", "4", "7", "2", "5");

        // System.out.println("Imprimindo todos os números");
        // randomNumbers.stream().forEach(System.out::println);
        // randomNumbers.forEach(System.out::println);

        // ------
        // System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um
        // Set");
        // var setString = randomNumbers.stream().limit(5)
        // .collect(Collectors.toSet());
        // setString.forEach(System.out::println);

        // ------
        // System.out.println("Transforme esta lista de String em uma lista de números
        // inteiros");
        // List<Integer> randomNumbersInt = randomNumbers.stream()
        // .map(Integer::parseInt)
        // .collect(Collectors.toList());
        // randomNumbersInt.forEach(System.out::println);

        // ------

        // System.out.println("Pegue os números pares e maiores que 2 e coloque em uma
        // lista");
        // List<Integer> randomNumbersInt = randomNumbers.stream()
        // .map(Integer::parseInt)
        // .filter(number -> number % 2 == 0 && number > 2)
        // .collect(Collectors.toList());
        // System.out.println(randomNumbersInt);

        // ------
        // System.out.println("Mostre a média dos números");

        // var avg = randomNumbers.stream().mapToInt(Integer::parseInt)
        // .average().getAsDouble();
        // System.out.println(avg);
        // .average().ifPresent(System.out::println);

        // ------
        // System.out.println("Remova os valores ímpares");
        // List<Integer> randomNumbersInt = randomNumbers.stream()
        // .map(Integer::parseInt)
        // .collect(Collectors.toList());
        // randomNumbersInt.removeIf(i -> i % 2 != 0);
        // System.out.println(randomNumbersInt);
        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);

    }
}
