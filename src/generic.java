
public class generic <T,E> {
    T first;
    E second;

    void genric(T n1, E n2) {
        this.first = n1;
        this.second = n2;

    }
    public T getFirst(){
        return first;
    };
    public E getSecond(){
        return second;
    }

    public static void main(String[] args) {
        generic vn1=new generic();
        System.out.println(vn1.getFirst());
        System.out.println(vn1.getSecond());
    }
}