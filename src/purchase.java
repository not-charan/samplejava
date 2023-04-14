import java.util.*;
public class purchase {
    String name;
    int groupcount;
    int groupprice;
    int numberbrought;

    public purchase() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the fruit:");
        this.name = input.nextLine();
        System.out.print("Enter the number of fruits in groupcount");
        this.groupcount = input.nextInt();
        System.out.print("Enter the group price:");
        this.groupprice = input.nextInt();
        System.out.print("Enter the number of fruits brought:");
        this.numberbrought = input.nextInt();

    }
}

    class apple extends purchase {
        public void aple() {
            int x= this.groupprice / this.groupcount;
            int a =x*this.numberbrought;
            System.out.print("Price of  apple is :");
            System.out.println(a);
        }
    }

    class mango extends purchase {
        public void mano() {
            int x = this.groupprice / this.groupcount;
            int c =x*this.numberbrought;
            System.out.println("Price of  mango is :");
            System.out.print(c);
        }
    }

    class result extends purchase {
    public static void main(String[] args) {
            mango a =new mango();
            apple c =new apple();
            a.mano();
            c.aple();
        }
    }




