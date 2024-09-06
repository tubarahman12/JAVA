import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter starting range: ");
        a= sc.nextInt();
        System.out.println("Enter ending range: ");
        b= sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isPrime(i)==1){
                System.out.println(i);
            }
        }
    }
    static int isPrime(int n){
        if(n<2){
            return 0;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
