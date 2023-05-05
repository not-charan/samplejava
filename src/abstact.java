import java.lang.*;
abstract class abstact {
    public  abstract void hey();
  public void hi(){
      System.out.println("hi");
  }
    }

class greet extends abstact{
    @Override
    public void hey() {
        System.out.println("hey");

    }

    public static void main(String[] args) {
        greet g1 = new greet();
        g1.hey();
        g1.hi();

    }

}