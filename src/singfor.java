import java.util.*;
public class singfor {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("First matrix:");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}

