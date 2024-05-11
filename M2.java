package Thread;
class Hi implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(5000);}
            catch(Exception e){}
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(5000);} catch(Exception e){}
        }
    }
}

public class M2{

    public static void main(String args[]){
        Hi obj=new Hi();
        Hello myj=new Hello();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(myj);
        t1.start();
        try{Thread.sleep(1000);} catch(Exception e){}
        t2.start();
    }
}
