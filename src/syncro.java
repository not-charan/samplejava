public class syncro  extends Thread {
   int  threadnumber;
    public syncro(int i) {
        this.threadnumber=i;
    }
    public void run() {
        for (int a = 0; a <= 5; a++) {
            System.out.println(a+"from the thread"+" "+threadnumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        for (int j = 0; j <= 5; j++) {
            syncro s1 = new syncro(j);
            s1.start();
        }
    }
}
