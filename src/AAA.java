import java.util.*;
public class AAA {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b = n;
        String a;
        for (int x = 1; x <= b ; x++) {
            System.out.print(",");

            for (int y=1;y<=2*x-1;y++) {

                System.out.print("&");

            }

            System.out.print("\n");
        }
    }
}
