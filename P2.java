package Matrix;
import java.util.*;

public class P2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][] matrix=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            int max=matrix[i][0];
            for(int j=1;j<c1;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
            System.out.println("Max element in row"+i+"is: "+max);
        }
        sc.close();
    }
}
