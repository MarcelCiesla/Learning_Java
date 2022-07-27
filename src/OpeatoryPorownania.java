import java.util.Scanner;

public class OpeatoryPorownania {

    public static void main(String[] args) {                     // opcja z wpisywaniem ręcznie wartości
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, Podaj druga liczbe");
        int secondNumber = scanner.nextInt();


        boolean result = secondNumber > firstNumber; // true

        System.out.println(result);
        System.out.println(firstNumber > secondNumber); // false
        System.out.println(firstNumber < secondNumber); // true
        System.out.println(firstNumber >= secondNumber); // false
        System.out.println(firstNumber <= secondNumber); // true
        System.out.println(firstNumber == secondNumber); //false == -> równa się
        System.out.println(firstNumber != secondNumber); // true != -> jest różne
    }
}
