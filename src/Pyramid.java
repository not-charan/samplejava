import java.util.Arrays;
import java.time.format.DateTimeFormatter;
public class Pyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i =0;i<n;i++) {
            for (int j=n-i;j>0;j--) {
                System.out.print(" ");
            }
            for (int j=0;(j<=(2*i));j++) {
                System.out.print("*");
            }

            System.out.print("\n");
            
        }
    }
}
