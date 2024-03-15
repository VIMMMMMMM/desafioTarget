package src;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        scanner.close();

        int fib1 = 0;
        int fib2 = 1;
        while (fib1 <= numero) {
            if (fib1 == numero) {
                System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
                return;
            }
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println("O numero " + numero + " nao pertence a sequencia de Fibonacci.");
    }
}

