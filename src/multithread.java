import java.util.Scanner;

public class multithread extends  Thread {
    public void run() {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        while (i <= 9) {
            System.out.println("thread Number " + Thread.currentThread().getId());
            i++;
        }
    }
    public static class bye extends Thread {
        public void run() {
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();
            while (i <= 9) {
                System.out.println("thread Number " + Thread.currentThread().getId());
                i++;
            }
        }


        public static void main(String[] args) {
            multithread m1 = new multithread();
            m1.start();
            bye b1 = new bye();
            b1.run();
        }




        }
    }
