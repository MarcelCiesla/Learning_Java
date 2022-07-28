public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
        /*metody.policzWynik();
        int result = metody.pobierzWynik();
        int result2 = result *2;
        System.out.println("rezultat przed mnozeniem to: " + result);
        System.out.println("rezultat po mnozeniu to: " + result2);*/
        metody.polliczWynikParam(2);
        metody.polliczWynikParam(100);
        metody.polliczWynikParam(23);

       /* int result = metody.add(2,3);
        System.out.println(result);*/

        int result = metody.add (2,3,"Hello");
        System.out.println(metody.add(2,6,"Hello2"));
        System.out.println(result);
    }
}
