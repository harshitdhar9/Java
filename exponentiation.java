import java.util.*;

public class exponentiation{
    public static void main(String args[]){

        int a=1;

        Scanner mynum = new Scanner(System.in);

        System.out.println("Enter Base");

        int num = mynum.nextInt();

        System.out.println("Enter Power");

        int pow = mynum.nextInt();

        for(int i=1;i<=pow;i++){
            a=a*num;
        }

        System.out.println("The entered number raised to the entered power is: "+ a);
        
        mynum.close();
        
    }
}

