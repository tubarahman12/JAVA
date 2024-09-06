import java.util.Scanner;

public class deciToBinry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        String s="";
        while(n!=0){
            s=(n%2)+s;
            n=n/2;
        }
        System.out.println(s);
    }
}
