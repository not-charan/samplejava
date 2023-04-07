import java.util.*;
public class multi {
    public  String name;

    public  String sound="woof";
    public  String action="sit";
    public  int legs=4;

    public String colour;
    public String animal(String name) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the dog name:");
        this.name=input.nextLine();
        return name;

    }

}
class single extends multi{
    public void skin(){
        Scanner into=new Scanner(System.in);
        System.out.println("Enter the colour:");
        this.colour=into.next();
        System.out.println(this.colour);
    }

}
class  printdog extends single {

    public static void main(String[] args) {
        single s1 = new single();
        s1.animal(s1.name);
        s1.skin();
        System.out.println(s1.sound);
        System.out.println(s1.legs);
        System.out.println(s1.action);


    }
}
