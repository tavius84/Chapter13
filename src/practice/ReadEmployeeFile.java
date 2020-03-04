package practice;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadEmployeeFile {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\js138436\\IdeaProjects\\Chapter13\\src\\practice\\Employees.txt");
        String s = "";

        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null){
                System.out.println(s);
                s = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Message: " + e);

        }
    }
}
