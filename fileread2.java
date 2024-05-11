package Files;
import java.io.*;
public class fileread2 {
    public static void main(String[] args) {
        String path="f1.txt";
        try(FileReader reader =new FileReader(path)){
            int ch;
            while((ch=reader.read())!= -1){
                System.out.print((char)ch);
            }
        } catch(IOException e){
            System.out.println("Error reading this file"+e.getMessage());
        }   
    }
}
