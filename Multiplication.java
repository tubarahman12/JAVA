import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows in first matrix");
        int r1= sc.nextInt();
        System.out.println("Enter number of coloumns in first matrix");
        int c1= sc.nextInt();
        int[][] arr1=new int[r1][c1];

        System.out.println("Enter number of rows in second matrix");
        int r2= sc.nextInt();
        System.out.println("Enter number of coloumns in second matrix");
        int c2= sc.nextInt();
        int[][] arr2=new int[r2][c2];

        int[][] arr3 = new int[r1][c2];

        System.out.println("Enter values in the first matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter values in the second matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("First matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }if(c1==r2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    arr3[i][j] = 0;
                    for (int k = 0; k < r2; k++) {
                        arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("matrix after multiplication: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("coloumn1 should be equal to row2 ");
        }
    }
}
