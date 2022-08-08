public class Footballer extends Person{

    public String footbalClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze footballer");
        this.footbalClub = footballClub;
    }

    public void eat() {
        System.out.println("I like healty food");
    }

    public void playFootbal() {
        System.out.println("I am playing footbal for " + footbalClub );
    }
}
