abstract class Animal{
    public abstract void animalsound();
    public abstract void sleep();
}
class Duck extends Animal{
    public void animalsound(){
        System.out.println("Quack");
    }
    public void sleep(){
        System.out.println("Smmm");
    }
}
public class progabs1 {
    public static void main(String args[]){
        Duck myduck=new Duck();
        myduck.animalsound();
        myduck.sleep();
    }
}
