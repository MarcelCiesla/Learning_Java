import java.util.Scanner;

public class ProgramZadanieDomowe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtractrion = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Wynik dodania: " + addition);
        System.out.println("Odejmowanie: " + subtractrion);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod);
    }
}
