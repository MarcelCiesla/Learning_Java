package files;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("text.txt");

        if(file.delete()) {
            System.out.println("usuneliśmy plik");
        } else {
            System.out.println("nie udało się");
        }
    }
}
