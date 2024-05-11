package Thread;

//import java.lang.*;

class Hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(5000);}
            catch(Exception e){}
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(5000);} catch(Exception e){}
        }
    }
}

public class M1{

    public static void main(String args[]){
        Hi obj=new Hi();
        Hello myj=new Hello();

        obj.start();
        try{Thread.sleep(1000);} catch(Exception e){}
        myj.start();
    }
}