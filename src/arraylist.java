import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(2,4);
        number.set(0,5);
        number.remove(0);
        System.out.println(number.size());
        System.out.println(number);
        number.clear();
        System.out.println(number);
    }
}
//Array list,LINKED LIST,HASH MAP,HASH SET
