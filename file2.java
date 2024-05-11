package Files;
import java.io.*;
public class file2 {
    public static void main(String[] args) {
        String firstfile="firstbin.txt";
        String secondfile="secondbin.txt";
        try(FileInputStream inputStream=new FileInputStream(firstfile);
        FileOutputStream outputStream=new FileOutputStream(secondfile)){
            byte[] buffer=new byte[1024];
            int bytesread;
            while((bytesread=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,bytesread);
            }
            System.out.println("Binary File Copied Successfully");

        } 
        catch(IOException e){
            System.out.println("Error occured"+e.getMessage());
        }
    }
}
