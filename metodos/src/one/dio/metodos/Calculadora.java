package one.dio.metodos;

public class Calculadora {
    public static void soma(double numero1, double numero2) {
        double res = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + res);
    }

    public static void subtracao(double num1, double num2) {
        double res = num1 - num2;
        System.out.println("A subtracao de " + num1 + " menos " + num2 + " é " + res);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }
}
