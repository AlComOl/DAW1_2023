package pruebasClase;

import java.util.Scanner;

public class CapicuaChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            System.out.println(numeroInvertido);
            numeroInvertido = numeroInvertido * 10 + digito;
            System.out.println(numeroInvertido);
            numero /= 10;
            System.out.println(numero);
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es capicúa.");
        } else {
            System.out.println(numeroOriginal + " no es capicúa.");
        }
    }
}