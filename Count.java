import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int c=0,c1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                c++;
            }else if(ch==' '){
                c1++;
            }
        }
        System.out.println("Number of vowels = "+c);
        System.out.println("Number of consonants = "+(s.length()-c-c1));
    }
}
