package Matrix;
import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=3;
        int c1=3;
        int r2=3;
        int c2=3;
        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=A[j][i];
            }
        }
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) 
                System.out.print(B[i][j] + " "); 
            System.out.print("\n"); 
        } 
        sc.close();
    }
}
