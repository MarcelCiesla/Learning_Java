package Exceptions;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) throws InvalidAgeExcpetion {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();

        if (wiek < 0) {
            throw new InvalidAgeExcpetion("You age is not walid");
        } else if (wiek <= 17) {
            System.out.println("Nie jesteś pełnoletni");
        } else {
            System.out.println("Jesteś pełnoletni");
        }
    }
}