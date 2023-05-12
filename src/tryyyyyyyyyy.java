public class tryyyyyyyyyy {
    public static void main(String[] args) {
        try {
            int a=50/0;
            System.out.println(a);
        }
        catch (ArithmeticException w  ){
            w.printStackTrace();
        }
        System.out.println("ran");
    }
}
