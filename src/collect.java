import java.util.*;
abstract class collect implements  List {
    public static void main(String[] args) {
        ArrayList<Integer> an=new ArrayList<Integer>();
        an.add(4);
        an.add(1);
        an.add(3);
        an.add(6);
        an.add(2);
        an.add(5);
        System.out.println(an);
        int a =an.get(3);
        System.out.println(a);


    }
}