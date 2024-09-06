public class fibonacchi {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        int sum ;
        for (int i = 2; i < n; i++) {
        sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}