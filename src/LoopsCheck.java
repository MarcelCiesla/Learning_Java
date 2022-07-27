public class LoopsCheck {
    public static void main(String[] args) {

        /*for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3: " + i);

            }
        }*/
        int[] number = new int[] {1,3,5,7,0};  // odwracanie tablicy (niby pojawia się na rozmowach o prace)

        for (int i=0; i<(number.length/2);i++) {
            int temp = number[i]; // dla i=0 1    i+1 3
            number[i] = number[number.length-1-i]; // 4 -> 0   3->7
            number[number.length-1-i] = temp; // 1 // number[3] =3
            System.out.println("literacja numer " + i);  //break point na czerwono do debugowania, klikamy shift+f9 lub klikamy tego robaka na gorze
        }

        for (int i=0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}

