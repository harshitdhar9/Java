import java.util.*;

public class reverse 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int len=name.length();
        char[] arr=name.toCharArray();
        String str="";

        for(int i=(len-1);i>=0;i--){
            str+=arr[i];
        }

        System.out.println(str);
    }
}
