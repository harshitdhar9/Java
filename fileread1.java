package Files;
import java.io.*;
public class fileread1 {
    public static void main(String[] args) {
        String path="f1.txt";
        try(BufferedReader reader =new BufferedReader(new FileReader(path))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("Error reading this file"+e.getMessage());
        }   
    }
}
