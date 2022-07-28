import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.dodawanie(firstNumber, secondNumber);
        int subtractrion = calculator.odejmowanie(firstNumber, secondNumber);
        int multiplication = calculator.mnozenie(firstNumber, secondNumber);
        float division = calculator.dzielenie(firstNumber, secondNumber);
        int mod = calculator.modulo(firstNumber,secondNumber);

        System.out.println("Wynik dodania: " + addition);
        System.out.println("Odejmowanie: " + subtractrion);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod);


        // Druga metoda (krótsza ale mniej czytelny zapis)
       /* System.out.println("Wynik dodania: " + calculator.dodawanie(firstNumber, secondNumber));
        System.out.println("Odejmowanie: " + calculator.odejmowanie(firstNumber, secondNumber));
        System.out.println("Mnozenie: " + calculator.mnozenie(firstNumber, secondNumber));
        System.out.println("Dzielenie: " + calculator.dzielenie(firstNumber, secondNumber));
        System.out.println("Modulo: " + calculator.modulo(firstNumber,secondNumber));*/





    }
}
