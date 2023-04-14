import java.util.*;
public class cat {
    public static void values(){
        System.out.println("ENter the weight in pounds:");
        Scanner input=new Scanner(System.in);
        float w =input.nextFloat();
        System.out.println("Enter the height:");
        float h =input.nextFloat();
        System.out.println("Enter the age:");
        int a =input.nextInt();
        double c= 655+(4.3*w)+(4.7*h)-(4.7*a);
        System.out.println(c);
    }

    public static void main(String[] args) {
        values();
    }
}
