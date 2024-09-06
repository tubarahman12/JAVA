import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n=sc.nextInt();
        double sum=0;
        int c=0;
        while(n!=0){
            int r=n%10;
            if(r==1) {
                sum = sum + Math.pow(2, c);
                c++;
            }
            else{
               c++;
            }
            n=n/10;
        }
        System.out.println(sum+" is a decimal number");
    }
}