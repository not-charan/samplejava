import java.util.ArrayList;
import java.util.HashSet;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<Integer>();
        ArrayList<Integer> numb =new ArrayList<Integer>();
        HashSet<ArrayList> collection =new HashSet<>();

        number.add(1);
        number.add(2);
        numb.add(12);
        numb.add(22);
        number.add(21);
        number.add(27);
        numb.add(123);
        number.add(2223);
        collection.add(numb);
        collection.add(number);
        System.out.println(collection);


    }
}

//Array list,LINKED LIST,HASH MAP,HASH SET
