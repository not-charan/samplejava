import java.util.*;
public class iterrablile {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();


        dq.addFirst("Chintala");
        dq.addLast("charan");
       dq.add("sri");

        System.out.println(dq.size());
    System.out.println(dq);
        String a =dq.removeLast();
        String b =dq.removeFirst();
        System.out.println("First name is " +b);

    }
}
