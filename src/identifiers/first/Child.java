package identifiers.first;

public class Child extends Parent{

    // klasa potomna bedaca w tej samej paczce nie ma dostępu do pól/metod "private"
    // private jest tylko dostępne w danej klasie w której sie znajduje

    //moze byc podczas rozmowy o prace, klasy private, protected, public (chodzi o to gdzie dana klasa ma dostęp)

    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();

    }
}
