package Files;
import java.io.*;
public class filewrite1 {
    public static void main(String[] args) {
        String path="f2.txt";
        try(FileWriter writer=new FileWriter(path)){
            String line="Hello,Good Morning!";
            writer.write(line);
            System.out.println("Content written successfully");
        }
        catch(IOException e){
        System.out.println("Error occured"+e.getMessage());
        }
    }
}
