import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();

        if (wiek <= 17) {
            System.out.println("Nie możesz kupic alkoholu");
        } else {
            System.out.println("Dziękuję za zakupy");
        }

    }
}
