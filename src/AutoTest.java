public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto ("mercedes", "klasa S" , 1999, 1999);

        /*Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rokProdukcji = 2021;
        mercedes.przebieg = 1000;*/

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto ("audi", "a5" , 2022, 0);

        /*Auto audi = new Auto ();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rokProdukcji = 2022;
        audi.przebieg = 0;*/

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noname = new Auto(null, null, 0, 0);

        noname.jedz();
        noname.hamuj();
        noname.info();

    }
}
