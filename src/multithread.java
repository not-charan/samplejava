import java.util.Scanner;

public class multithread extends  Thread {
    public void run() {


            System.out.println("thread Number " + Thread.currentThread().getId());
    }
    public static class bye extends Thread {
        public void run() {

                System.out.println("thread Number " + Thread.currentThread().getId());

        }
        public static class joke extends bye{
            public void run(){
                System.out.println("thread Number " + Thread.currentThread().getId());
            }
        }


        public static void main(String[] args) {
            multithread m1 = new multithread();
            m1.start();
            bye b1 = new bye();
            b1.run();
            joke j1=new joke();
            j1.run();
        }




        }
    }
