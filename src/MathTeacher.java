public class MathTeacher extends Person{

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze mathteacher");
        this.school = school;
    }

    public void teachmath() {
        System.out.println("I am teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}