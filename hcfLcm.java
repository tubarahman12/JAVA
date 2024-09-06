import java.util.Scanner;

public class hcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int max,hcf=1;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        for(int i=1;i<=max;i++){
            if(a%i==0&&b%i==0)
                hcf=i;
        }
        int lcm=(a*b)/hcf;
        System.out.println("HCF= "+hcf);
        System.out.println("LCM= "+lcm);
    }
}
