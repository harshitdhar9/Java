import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter 2 Numbers");

    float a = myObj.nextFloat();
    float b = myObj.nextFloat();
    float c=a+b;

    System.out.println("sum is: "+c);
    
    myObj.close();
  }
}