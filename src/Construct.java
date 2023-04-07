import java.io.File;

import java.io.FileWriter;
import java.io.IOException;


public class Construct {
    public static void main(String[] args) {
        File newfile = new File("Okfile.txt");
        try {
            newfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file ");
            e.printStackTrace();
        }

    }
}




