import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Vasco", 18, "amarelo"));
        meusGatos.add(new Gato("Jon", 12, "preto"));
        meusGatos.add(new Gato("Simba", 6, "tigrador"));

        // Functional Interface
        // meusGatos.sort(Comparator.comparing(new Function<Gato, String>() {
        // @Override
        // public String apply(Gato gato) {
        // return gato.getNome();
        // }
        // }));

        // Lambda
        // meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));
        meusGatos.sort(Comparator.comparing(gato -> gato.getNome()));

        // Reference Method
        meusGatos.sort(Comparator.comparing(Gato::getNome));

        for (Gato gato : meusGatos) {
            System.out.println(gato.getNome());
        }
    }
}
