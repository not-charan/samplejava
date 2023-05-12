import java.util.Scanner;

class working {
    int identification;
    String brand;
    int mileage;
    int year;
    Scanner input = new Scanner(System.in);

      void working() throws Workingexception {
        System.out.print("Enter the identification number:");
        this.identification = input.nextInt();

        int n = 4;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            identification = identification % 10;
            count = count + 1;
        }
        try {
            if (count != 4) {
                throw new Workingexception();
            }
        } catch (Workingexception e) {
            System.out.println(e.getMessage());
            System.out.print("Enter the brand name:");
            this.brand = input.toString();
            try {
                if (brand != "Ford" || brand != "Honda" || brand != "Toyota" || brand != "Chrysel") {
                    throw new Workingexception();
                }

            } catch (Workingexception a) {
                System.out.println(a.getMessage());
            }
            System.out.print("Enter the mileage: ");
            this.mileage = input.nextInt();
            try {
                if (mileage <= 0) {
                    throw new Workingexception();
                }
            } catch (Workingexception p) {
                System.out.println(p.getMessage());
            }
            System.out.println("Enter the year of manufacturing");
            this.year = input.nextInt();
            try {
                if (year <= 2017 || year >= 1997) {
                    throw new Workingexception();

                }
            } catch (Workingexception q) {
                System.out.println(q.getMessage());
            }
        }
        }
    public static void main(String[] args) {
         working w1 =new working();
        try {
            w1.working();
        } catch (Workingexception e) {
            throw new RuntimeException(e);
        }
    }
}
    class Workingexception extends Exception {
        public String toString() {
            return super.toString() + "qwException";
        }
        public String getMessage() {
            return super.getMessage() + "Exception";
        }
    }


