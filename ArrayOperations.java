import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
       int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in the array");
        for(int i=0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0,max=arr[0],min=arr[0];
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double avg=sum/n;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}