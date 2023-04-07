import java.util.ArrayList;
import java.util.Arrays;

class pen{
    String colour;
    String type;
    ArrayList<Integer> arrah=new ArrayList<Integer>();
    public void write()
    {
        System.out.println("write someting");


    }
     public void printcolour(){
         System.out.println(this.colour);
     }
 }

 public class classss {
    public static void main(String[] args){
        pen pen1= new pen();
        pen1.colour="Black";
        pen pen2=new pen();
        pen2.type="ball";
        pen2.colour="blue";
        pen1.printcolour();
        pen2.printcolour();

    }
}

