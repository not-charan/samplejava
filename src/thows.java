import java.util.Scanner;
class Negativeradius extends Exception {
    @Override
    public String toString() {
        return super.toString()+ "Negative radius exception";
    }
    @Override
    public String getMessage() {
        return super.getMessage()+"Negative radius exception";
    }
}

public  class thows{
    Scanner sc =new Scanner(System.in);
    int r =sc.nextInt();
    public void radius() throws Negativeradius {
            if (r<0){
                throw new Negativeradius();
            }
            else {
                System.out.println(Math.PI*r*r);
            }
    }

    public static void main(String[] args) {
        thows t1 =new thows();
        try {
           t1.radius();
        }
        catch (Negativeradius e){
            System.out.println("Negative radius doesn't exist");
        }
    }

}