// operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4;

        int addition = firstNumber + secondNumber; //10
        int subtractrion = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber/secondNumber; //0.66
        int mod = secondNumber%firstNumber; // ile razy 4 mieści się w 6 czyli 4 i reszta 2 (reszta z dzielenia)

        System.out.println("Wynik dodania: " + addition);  // +
        System.out.println("Odejmowanie: " + subtractrion); // +
        System.out.println("Mnożenie: " + multiplication); // +
        System.out.println("Dzielenie: " + division); // +
        System.out.println("Modulo: " + mod); //+

        firstNumber+=secondNumber; // firstNumber = firstNumber = secondNumber
        System.out.println("Po dodaniu: " + firstNumber); //10
        firstNumber-=secondNumber; // fiestNumber - secondNumber
        System.out.println("Po odejmowaniu; " + firstNumber); //4
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); //24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniuu: " + firstNumber); //4
        //firstNumber%=secondNumber; // firstNumber % secondNumber
        //System.out.println("Po modulo: " + firstNumber); //4




    }
}
