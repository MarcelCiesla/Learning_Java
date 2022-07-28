public class UserTest {

    public static void main(String[] args) {

        //User user = new User();
        User user = new User ("Mekelek", "rampampam");

        /*user.username = "Marcel";
        user.password = "QWERTY";*/
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
