public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "Polsl po zmianie";

    public void przedstawSie () {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Loguje się za pomocą " + nick);
    }

    public void podajNrInedksu() {
        System.out.println("Moj numer indeksu to :" + numerIndeksu);
    }

    public void podajEmail() {
        System.out.println("Mój email to: " + email);
    }

    public static void infoUczelnia() {
        System.out.println("moja uczelnia to: " + nazwaUczelni);
        druga();

    }

    public static void druga() {
        System.out.println("jestem drugą metodą");
    }
}
