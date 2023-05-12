import java.util.Arrays;
import java.util.Scanner;
class QuartsToGallons {
    private int[] quarts;
    private double[] gallons;
    public QuartsToGallons() {
        quarts = new int[0];
        gallons = new double[0];
    }
    public void convert() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an array of integers (separated by commas): ");
            String quartsStr = scanner.nextLine();
            String[] quartsArr = quartsStr.split(",");
            quarts = new int[quartsArr.length];

            for (int i = 0; i < quartsArr.length; i++) {
                quarts[i] = Integer.parseInt(quartsArr[i].trim());
            }

            gallons = new double[quarts.length];

            for (int i = 0; i < quarts.length; i++) {
                gallons[i] = (double) quarts[i] / 4;
            }

            System.out.println("Quarts: " + Arrays.toString(gallons));
            System.out.println("Gallons: " + Arrays.toString(quarts));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please enter integers only.");
        } catch (NegativeArraySizeException e) {
            System.out.println("An negative array " + e.getMessage());
        }

        finally {
            scanner.close();
        }
    }
    class  print {
        public static void main(String[] args) {
            QuartsToGallons q2g =new QuartsToGallons();
            q2g.convert();
        }
    }
}


