public class ReadOnly {

    //getter     pobieranie wartości z pól prywatnych
    private String name = "Marcel";

    public String getName() {
        return name;
    }

    // setter   umożliwia ustawienie wartości pola prywatnego

    public void setName(String name) {
        this.name = name;
    }

}
