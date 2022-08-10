package animals;

public abstract class Animal {
 // na rozmowie o prace jakie są róznice miedzy interfejsem a klasą abstrakcyjną
    public final static int legs = 4;

    public abstract void sound();

    public void sayHello() {
        System.out.println("hello I am an animal");
    }
}
