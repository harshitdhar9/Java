import java.util.*;

public class Vector{
    public static void main(String args[]) {
        Vector V = new Vector();                            //vector class
        ArrayList<Integer> prime =new ArrayList<>();
        ArrayList<Integer> nonprime =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0; i<num;i++) {
            int ele =sc.nextInt();
            int count =0;
            for (int j=1; j <=ele;j++) {
                if(ele%j==0){
                    count++;
                }
            }
            if(count==2){
                prime.add(ele);
            }else if(count>2){
                nonprime.add(ele);
            }
        }
        System.out.println("Vector (Prime)::");
        for(int k=0;k<prime.size();k++){
            System.out.print(prime.get(k)+" ");
        }
        System.out.print("\n");                      //to print in next Line
        System.out.println("Vector (Non Prime)::");
        for(int k=0;k<nonprime.size();k++){
            System.out.print(nonprime.get(k)+" ");
        }
    }
}

