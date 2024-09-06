import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or string");
        String n = sc.nextLine();
        isPalindrome(n);
    }

    private static void isPalindrome(String s){
        String s2="";
        for(int i=0;i<s.length();i++){
            s2=s.charAt(i)+s2;
        }
        System.out.println(s2);
        if(s2.equals(s)){
            System.out.println(s +" is palindrome");
        }else{
            System.out.println(s +" is not palindrome");
        }
    }
}
