
import java.util.*;
public class split{
    public static void main(String[] args){

        String str = "1, 2, 3";

        String[] parts = str.split(",");

        System.out.print(Arrays.toString(parts));
    }
}

