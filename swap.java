import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<Integer>(a);
        for (int i = 0; i < a; i++) {
            int num = sc.nextInt();
            arr1.add(num);
        }
        Integer[] arr = new Integer[arr1.size()];
        arr = arr1.toArray(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
