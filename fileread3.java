package Files;
import java.io.*;
import java.util.*;
public class fileread3 {
    public static void main(String[] args) {
        String path="f1.txt";
        try(Scanner scanner =new Scanner(new File(path))){
            
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.print(line);
            }
        } catch(IOException e){
            System.out.println("Error reading this file"+e.getMessage());
        }   
    }
}
