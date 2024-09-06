import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int p=1;
        for(int i=2;i<=n;i++){
            p=p*i;
        }
        System.out.println("Factorial of "+n+" is "+p);
    }
}
