package Matrix;
import java.util.*;

public class P1{
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of row of matrix 1. ");
        int r1=sc.nextInt();
        System.out.print("Enter length of column of matrix 1. ");
        int c1=sc.nextInt();
        System.out.print("Enter length of row of matrix 2. ");
        int r2=sc.nextInt();
        System.out.print("Enter length of column of matrix 2. ");
        int c2=sc.nextInt();

        int [][] mat1=new int[r1][c1];
        int [][] mat2=new int[r2][c2];
        int res[][]=new int[r1][c2];

        System.out.println("Enter elements of matrix 1. ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print("Enter element at index"+i+","+j+"  ");
                mat1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix 2. ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print("Enter element at index"+i+","+j+"  ");
                mat2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix after multiplication is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                res[i][j]=0;
                for(int k=0;k<r2;k++)
                    res[i][j]+=mat1[i][k]*mat2[k][j];
                    System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }

        sc.close();

    }
}
