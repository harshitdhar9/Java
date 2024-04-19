import java.util.*;

public class removeduplicates {
    public static ArrayList<Integer> removeduplicates(ArrayList<Integer> arr) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int element : arr) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            int inp = sc.nextInt();
            arr.add(inp);
        }
        ArrayList<Integer> newlist1 = removeduplicates(arr);
        System.out.print(newlist1);
    }
}
