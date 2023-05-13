import java.util.Scanner;

public class capital_state {


    static void array1() throws ArrayIndexOutOfBoundsException{
        Scanner input =new Scanner(System.in);
        String[] a =new String[8];
        String[] b =new String[8];
        a[0]="Assam";
        a[1]="Uttar Pradesh";
        a[2]="Maharastra";
        a[3]="Bihar";
        a[4]="Goa";
        a[5]="Jharkhand";
        a[6]="Haryana";
        a[7]="Gujarath";
        b[0]="Dispur";
        b[1]="Lucknow";
        b[2]="Mumbai";
        b[3]="Patna";
        b[4]="Panaji";
        b[5]="Ranchi";
        b[6]="Chandigarh";
        b[7]="Gandhi Nagar";
        int number =input.nextInt();
        try {
            if(number>=a.length) {
                throw new ArrayIndexOutOfBoundsException("Index is out of bound");
            }
            else {
                System.out.println("The state is:"+ a[number]);
                System.out.println("The capital is:" +b[number]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        capital_state.array1();
    }
}
