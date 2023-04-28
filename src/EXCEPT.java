import java.util.Scanner;

public class EXCEPT {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int a =input.nextInt();
        if(a<=99){
            try {
                throw new Excepts();
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }

    }
}
 class Excepts extends Exception {
    public String toString(){
        return  "Iam from to string";  //overide

    }

    public String getMessage()
    {
        return "Iam from get message"; // override
    }


}
