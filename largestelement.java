import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in the array");
        for(int i=0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum = "+max);
    }
}
