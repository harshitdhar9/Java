package Matrix;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P4 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][] matrix=new int[r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        Integer array1[]=new Integer[arr.size()];
        array1=arr.toArray(array1);
        int k=0;
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix[i][j]=array1[k++];
            }
        }
        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c1; j++) 
                System.out.print(matrix[i][j] + " "); 
            System.out.print("\n"); 
        } 
        sc.close();
    }
}
