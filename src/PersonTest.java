public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "university" );
        teacher.name = "Tom";
        teacher.age = 29;
        teacher.school = "University";
        teacher.walk();
        teacher.eat();
        teacher.teachmath();
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21, "Fc Barcelona");
        footballer.name = "Mike";
        footballer.age = 21;
        footballer.walk();
        footballer.eat();
        footballer.footbalClub = "FC Barcelona";
        footballer.playFootbal();

    }
}
