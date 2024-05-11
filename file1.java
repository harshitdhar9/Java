package Files;

import java.io.*;
public class file1 {
    public static void main(String[] args) {
        String firstfile="first.txt";
        String secondfile="second.txt";
        try(FileReader s=new FileReader(firstfile);FileWriter t =new FileWriter(secondfile)){
            int ch;
            while((ch=s.read())!=-1){
                t.write(ch);
            }
            System.out.println("Text File Copied Successfully");

        } 
        catch(IOException e){
            System.out.println("Error occured"+e.getMessage());
        }
    }
}
