package lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 21);

        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };

        sayHello("Pawel", med, 31);

        // wyrazenia lambda pozwalaja pisac kod w sposob bardziej zwiezly, nasz kod
        // zyskuje wtedy na czytelnosci, jest to krotka forma zapisania klasy anonimowej
        // ktora jest implementacja interfejsu posiadajaca tylko jedna metode
        // parametr mozna stosowac zamiast Override wtedy jest bardziej czytelniejszy zapis
        // (parametr) -> System.out.println("I am not a student, My name is " + name);
        Student noStudent = (name, age) -> {
            System.out.println("I am not a student, My name is " + name + " I am " + age);
            if(age>18) {
                System.out.println("you can buy beer");
            }
        };
        sayHello("Tom", noStudent, 21);

    }

    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name, age);
    }
}
