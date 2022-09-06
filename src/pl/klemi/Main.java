//Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka możesz
// użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną rzuć wyjątek
// java.lang.IllegalArgumentException. Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.

package pl.klemi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Exceptions();
        }

        catch (InputMismatchException IME){
            System.out.println(IME + "Znaki niedozwolone, podaj liczbe!");
        }

    }

    public static double SquareRoot(double userInput){

        return Math.sqrt(userInput);
    }

    static void Exceptions() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę do obliczenia pierwastka:");
        double userInput = scanner.nextDouble();

        if (userInput < 0) {

            try {
                throw new IllegalArgumentException("Liczba musi byc wieksz lub rowna 0!");
            } catch (IllegalArgumentException negative) {
                System.out.println(negative);
                System.out.println(" Pierwiastek z liczby " + userInput * (-1) + " wynosi: " + SquareRoot(userInput * -1));

            }
        }
        else {

            System.out.println("Pierwiastek z podanej liczby "+userInput+" wynosi "+SquareRoot(userInput));
        }

        }


}


