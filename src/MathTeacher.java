public class MathTeacher extends Person{

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze mathteacher");
        this.school = school;
    }

    // metoda super daje nam mozliwosc do odwolywani sie do metod ktore znajduja sie wewnatrz klasy pierwotnej
    public void walk() {
        super.walk();
        System.out.println("I walk very fast");
    }

    public void teachmath() {
        System.out.println("I am teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
