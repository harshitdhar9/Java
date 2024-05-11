package Files;
import java.io.*;
import java.nio.file.*;
import java.nio.file.StandardOpenOption;
public class filewrite3 {
    public static void main(String[] args) {
        String path="f2.txt";
        try{
            String line="Hello,Good Morning!";
            Files.writeString(Path.of(path),line,StandardOpenOption.CREATE);
            System.out.println("Content written in file.");
        }
        catch(IOException e){
            System.err.println("Error writing file"+e.getMessage());
        }
    }
}
