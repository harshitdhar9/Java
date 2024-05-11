package Files;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class match {
    public static void main(String[] args) {
        String path="input.txt";
        String patternStr="\\b\\w+\\b";
        try(BufferedReader reader =new BufferedReader(new FileReader(path))){
            String line;
            Pattern pattern=Pattern.compile(patternStr);
            while((line=reader.readLine())!=null){
                Matcher matcher =pattern.matcher(line);
                while(matcher.find()){
                    System.out.println("Matching string found: "+matcher.group());
                }
            }
        }catch(IOException e){
            System.err.println("Error reading file"+e.getMessage());
        }
    }
}
