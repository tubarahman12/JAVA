
import java.util.Arrays;
public class fcfs {
    public static void main(String[] args) {
    int[] pid={1,2,3,4,5};
    int[] at={2,5,1,1,7};
    int[] bt={2,6,4,7,4};
    sort(at,bt);
    int[] ct=ct(at,bt);
    int[] tat=tat(ct,at);
    wt(tat,bt);
    }
    public static int[] ct(int[] at,int[] bt){
        int[] ct=new int[5];
    ct[0]=at[0]+bt[0];
    int diff=0;
    for(int i=1;i<5;i++){
        if(ct[i-1]<at[i]){
             diff=at[i]-ct[i-1];
        }
    ct[i]=ct[i-1]+bt[i]+diff;
    diff=0;
}
        System.out.println("Completion time = "+Arrays.toString(ct));
        return ct;
    }
    public static int[] tat(int[] ct,int[] at){
        int[] tat=new int[5];
        for(int i=0;i<5;i++){
            tat[i]=ct[i]-at[i];
        }
         System.out.println("Turn Around Time = "+Arrays.toString(tat));
         return tat;
    }
    
     public static void wt(int[] tat,int[] bt){
        int[] wt=new int[5];
        for(int i=0;i<5;i++){
            wt[i]=tat[i]-bt[i];
        }
         System.out.println("Waiting Time = "+Arrays.toString(wt));
    }

    private static void sort(int[] at, int[] bt) {
   for(int i=0;i<5;i++){
       for(int j=0;j<5-i-1;j++){
           if(at[j]>at[j+1]){
               int t=at[j];
               at[j]=at[j+1];
               at[j+1]=t;
               int x=bt[j];
               bt[j]=bt[j+1];
               bt[j+1]=x;
           }
       }
   }
    }
}
