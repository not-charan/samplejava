import java.lang.*;
public class runnable implements Runnable{
    public void run(){
        System.out.println("World!");
    }

    public static void main(String[] args) {
        runnable r1 =new runnable();
        runnable r2 =new runnable();
        Thread t1 =new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        System.out.print("Hello ");

    }
}