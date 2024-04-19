import java.util.*;
public class Test1 {
    String Name;
    String Salary;
    public Test1(String Name,String Salary){                  //Constructor
        this.Name=Name;
        this.Salary=Salary;
    }
    @Override                                                 //Overriding toString method
    public String toString(){
        return "Employee [name="+Name+", salary="+Salary+"]";
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();                                        //Clears buffer
        ArrayList<String> al=new ArrayList<String>();
        ArrayList<String> bl=new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Salary:");
            String sal=sc.nextLine();
            //Test1 obj=new Test1(name,sal);                  //To print with object creation
            //System.out.print(obj);
            //sc.nextLine();                                  //to prevent enter name and salary to print in same line
            al.add(name);
            bl.add(sal);
        }
        for(int i=0;i<num;i++){
            Test1 obj=new Test1(al.get(i),bl.get(i));
            System.out.println(obj);
        }
    }
}

