import java.util.Scanner;
import java.util.Arrays;
public class arrays {
    public static int addarray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }
        array[0]=100;
        System.out.println("Sum of elements of array is: "+addarray(array));
        System.out.println(Arrays.toString(array));
        
    } 
}
