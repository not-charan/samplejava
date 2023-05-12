import java.util.*;
 class quartztogall {


    }
  class convesion extends quartztogall {
      public void Quatrzinput() {
          System.out.println("Enter the number of elements in array");
          Scanner input = new Scanner(System.in);
          String s = input.nextLine();
          try {
              Integer a = Integer.parseInt(s);
              String[] c = new String[a];
              for (int i = 0; i <= c.length - 1; i++) {
                  Integer z = Integer.parseInt(c[i]);
                  double gallon[] = new double[a];
                  for (int va = 0; va <= c.length - 1; va++) {
                      double quatz = gallon[z] / 4;
                      gallon[va] = quatz;
                      System.out.println(gallon);
                  }
              }
          }
          catch (NumberFormatException e){
              e.printStackTrace();

          }
          catch (NegativeArraySizeException b){
              b.printStackTrace();
          }
      }
  }
      class abc{
      public static void main(String[] args){
      convesion c1 =new convesion();
      c1.Quatrzinput();
      }
 }



