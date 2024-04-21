import java.util.*;

public class ArrayRotation {
    public static String rotateArray(int[] arr, int n){

        int len =arr.length;
        int[] temp=new int[len];

        for(int i=0;i<len;i++){
            temp[(i+n)%len]=arr[i];
            System.out.println(Arrays.toString(temp));
        }

        for(int i=0;i<len;i++){
            arr[i]=temp[i];
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+"th element: ");
            int element=sc.nextInt();
            array[i]=element;
        }
        System.out.print("Enter number of rotations: ");
        int rotate=sc.nextInt();
        System.out.println("Array before rotation is: "+Arrays.toString(array));
        System.out.println("Array after rotation is: "+rotateArray(array, rotate));
    }
}

