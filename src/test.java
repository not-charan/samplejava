import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] a =new int[9];
        a[0]=1;
        a[1]=2;
        a[3]=3;

        try {
            try {
                System.out.println(a[2]);
            }
            catch (ArithmeticException e){
                e.printStackTrace();
            }
            catch (NullPointerException c ){
                c.printStackTrace();
            }
        }
        catch (ArrayIndexOutOfBoundsException b){
            b.printStackTrace();
        }
    }
}
