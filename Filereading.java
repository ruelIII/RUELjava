import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Filereading {

    public static void main(String[] args) {

        File textfile = new File("main.txt");

        try {

            Scanner scan = new Scanner(textfile);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();

        } catch (IOException e) {
            System.out.println("error");
        }

    }
}