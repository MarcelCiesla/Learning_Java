import java.util.Scanner;

public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student Marcel = new Student();
        Marcel.imie = "Marcel";
        Marcel.nazwisko = "Ciesla";
        Marcel.numerIndeksu = 2137;
        Marcel.nick = "Mekelek";
        Marcel.email = "RAMPAM@MAP.pl";
        String uczelniaMarcela = Marcel.nazwaUczelni;
        Marcel.infoUczelnia();

        Student Dominika = new Student();
        Dominika.imie = "Dominika";
        Dominika.nazwisko = "Zog";
        Dominika.numerIndeksu = 1377;
        Dominika.nick = "Giga lojt";
        Dominika.email = "PAMPAM@.pl";

        Student Pawel = new Student();
        Pawel.imie = "Pawel";
        Pawel.nazwisko = "Rak";
        Pawel.numerIndeksu = 1789;
        Pawel.nick = "Popus";
        Pawel.email = "Gangalbanii@essa.al";

        Student[] students = new Student[3];
        students[0] = Marcel;
        students[1] = Dominika;
        students[2] = Pawel;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrInedksu();
            students[i].zalogujSie();
        }

        /*String imie = "Kasia";               //klasy
        imie.strip();
        Scanner scanner = new Scanner(System.in);*/


    }
}
