import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("Enter number of rows in the matrix");
        r = sc.nextInt();
        System.out.println("Enter number of columns in the matrix");
        c = sc.nextInt();
        System.out.println("Enter values in the matrix");
        int[][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix before transpose");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix after transpose");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr1[j][i]+" ");
            }
            System.out.println();
        }
    }
}
