import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r,c;
        System.out.println("Enter number of rows in the matrix");
        r= sc.nextInt();
        System.out.println("Enter number of coloumns in the matrix");
        c= sc.nextInt();
        System.out.println("Enter values in both the matrix");
        int[][] arr1=new int[r][c];
        int[][] arr2=new int[r][c];
        int[][] arr3=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]= sc.nextInt();
                arr2[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("First matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix after addition: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
