import java.util.Scanner;

public class e1 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner input =new Scanner(System.in);
        int num1 =input.nextInt();
        int num2=input.nextInt();
        try {
            double a= num1/num2;
            System.out.println("Result is "+ a) ;
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
        finally {
            System.out.println("Rest of the code can be executed by using finally block");
        }
    }
}
