import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FilewriterProgram {

    public static void main(String[] args) {

        File textFile = new File("main.txt");

        try {
            FileWriter ruel = new FileWriter(textFile);
            ruel.write("JOpeTA");
            ruel.close();
            System.out.println("Printed successfully");

        } catch (Exception e) {
            System.out.println("nag error");
            e.printStackTrace();
        }

    }
}
