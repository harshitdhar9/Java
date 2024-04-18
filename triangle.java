
import java.util.*;

public class triangle {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Numbers");

    double a= sc.nextDouble();
    double b= sc.nextDouble();
    double c= sc.nextDouble();
    double s= sc.nextDouble();
    double x=0.5;

    double d= Math.pow(s*(s-a)*(s-b)*(s-c),x);

    System.out.println(d);

    sc.close();
    }
}
