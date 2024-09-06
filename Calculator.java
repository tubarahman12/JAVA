import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the operator which you want to calculate");
        char ch=sc.next().charAt(0);
        if (ch == '+') {
            System.out.println("Sum is "+(a+b));
        } else if (ch=='-') {
            System.out.println("Difference is "+(a-b));
        } else if (ch=='*') {
            System.out.println("Multiplication is "+(a*b));
        } else if (ch=='/') {
            if(b==0){
                System.out.println("cannot divide by zero");
            }else{
                System.out.println("Division is is "+(a/b));
            }
        }else {
            System.out.println("Wrong operator");
        }
    }
}
