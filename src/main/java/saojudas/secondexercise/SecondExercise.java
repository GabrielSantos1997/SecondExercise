package saojudas.secondexercise;

import java.util.Scanner;

/**
 *
 * @author Gabriel Jerônimo dos Santos
 * RA: 818125147
 *
 */
public class SecondExercise {
    public static void main(String[] args) {
        double number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        number = scanner.nextDouble();

        System.out.println("O número digitado foi: " + number);
    }
}
