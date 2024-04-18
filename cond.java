
import java.util.*;
public class cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a%2==0){
            if (a>=2 && a<=5){
                System.out.println("Not Wierd");
            }
            else if (a>=6 && a<=20){
                System.out.println("Wierd");
            }
            else if (a>20){
                System.out.println("Not Wierd");
            }
        }
        else{
            System.out.println("Wierd");
        }
        scanner.close();
    }
}

