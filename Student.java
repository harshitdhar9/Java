import java.util.Scanner;

public class Student {
    private String name;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        this.name = sc.nextLine();
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student Name: " + student.getName());
    }
}
