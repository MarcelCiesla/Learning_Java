public class InkrementacjaDekrementacja {

    public static void main(String[] args) {

        //inkrementacja zwieskzanie wartosci o 1
        int a = 0;
        System.out.println("wartość a: " + a);  // 0
        int b = ++a;   // jak "++" przed wartością to preinkrementacja
        System.out.println("wartość b: " + b);  // 1
        System.out.println("wartość a: " + a);  // 1
        int c = a++;  //jak "++" po wartości to postinkrementacja
        System.out.println("wartość c: " + c); // 1
        System.out.println("wartość a: " + a); // 1


        //dekrementacja zmniejszanie wartości o 1
        int d = 0;
        System.out.println("wartość d: " + d);  // 0
        int e = d--;
        System.out.println("wartość e: " + e);  // 0
        System.out.println("wartość d: " + d);  //-1
        int f = --d;
        System.out.println("wartość f: " + f); // -2
        System.out.println("wartość d: " + d); // -2


    }
}
