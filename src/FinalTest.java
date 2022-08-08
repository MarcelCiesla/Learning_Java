public class FinalTest {

    // pola typu final sa niezmienne, nie da sie nadpisac ich wartości

    public static void main(String[] args) {
        final int x = 2;
        // x = 5 (nie da się)

        final Person person = new Person("tim",26);
        person.age = 25;

        // Person person = new Person("paweł", 23)
        // nie da się stworzyć nowej persony



    }
}
