import java.util.Scanner;
interface inter {
     void alpha();
    }

    interface  engine{
     void number();
    }
 class yo implements inter,engine{
    @Override
    public void alpha() {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(s);
    }
    public void number(){
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        System.out.println(a);

    }
    public static void main(String[] args) {
      yo a1 =new yo();
      a1.alpha();
      a1.number();
      yo a2 =new yo();
      a2.number();
    }
}