package interview;

public class Palindrom {

    // czy wyraz jest palindromem (czy da sie go odczytac od lewej jak i od prawej)
    // kajak

    public static void main(String[] args) {
        System.out.println(isPallindrom("xanax"));
    }

    public static boolean isPallindrom(String word) {
        int n = word.length();
        for (int i = 0; i < (n / 2); i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
