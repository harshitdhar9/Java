package Files;
import java.io.*;
public class file3 {
    public static void main(String[] args) {
        String path="test.txt";
        File file=new File(path);
        if(file.exists()){
            long fileSizeInBytes=file.length();
            double fileSizeInKiloBytes=(double)fileSizeInBytes/1024;
            double fileSizeInMegaBytes=fileSizeInKiloBytes/1024;
            System.out.println("File Size"+fileSizeInBytes+"bytes");
            System.out.println("File Size"+fileSizeInKiloBytes+"KB");
            System.out.println("File Size"+fileSizeInMegaBytes+"MB");
        }
        else{
            System.out.println("File was not found");
        }
    }
}
