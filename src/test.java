import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] a =new int[9];
        a[0]=1;
        a[1]=2;
        a[3]=3;
        Scanner sc =new Scanner(System.in);
        int c =sc.nextInt();
        try {
            System.out.println(a[c]);
            try {
                System.out.println(a[0]/0);

            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }

        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println(b.getMessage());
        }
    }
}
