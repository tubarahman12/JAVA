import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year= sc.nextInt();
        if(year%4==0&&year%100!=0){
            System.out.println(year+" is a leap year");
        }if(year%400==0){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
}
