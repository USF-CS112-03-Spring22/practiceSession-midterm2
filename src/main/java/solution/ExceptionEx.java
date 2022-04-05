package solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx {

    public static void func(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }

    public static void main(String[] args) {
        // Will print ACD, if songs.txt does not exist
        try {
            System.out.print("A");
            func("songs.txt");
            System.out.print("B");
        }
        catch (IOException e) {
            System.out.print("C");
        }
        System.out.println("D");
    }
}
