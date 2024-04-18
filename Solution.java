
import java.util.*;
public class Solution{
    public static double myPow(double x, int n){
        double a = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                a = a * x;
            }
        } 
        else {
            for (int i = 1; i <= -n; i++) {
                a = a * (1/x);  
            }
        }
        return Math.round(a * 100000) / 100000.0;
    }
        public static void main(String[] args){
        Scanner mynum = new Scanner(System.in);
        double a1 = mynum.nextDouble();
        int a2 = mynum.nextInt();
        myPow(a1,a2);
        mynum.close();
        }
}