import java.io.File;
import java.io.IOException;

class Filecreation {

    public static void main(String[] args) {
        File Textfile = new File("main.txt");

        try {

            if (Textfile.createNewFile()) {
                System.out.println("file created");
            } else {

                System.out.println("file existing already");
            }

            Textfile.createNewFile();
            System.out.println("file successfully!");

        } catch (IOException e) {

            System.out.println("nag error");
        }

    }

}