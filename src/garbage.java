public class garbage {
    public  void meth() {
        System.out.println("HI");
    }
    public static void main(String[] args) {
        garbage c=new garbage();
        garbage d =new garbage();
        c=null;
        d=null;
        System.gc();
    }
}
