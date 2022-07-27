public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true wtedy, gdy wyrażenia składowe są równe true

        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || lub -> true gdy jedno wyrażenie składowe jest równe true

        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || thirdValue); // false
        System.out.println(firstValue || fourthValue); // true

        // ! negacja -> zwraca wartość przeciwną do wyrażenia przed którym się znajduje

        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!(firstValue && secondValue));



    }
}




