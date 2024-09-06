
import java.util.Arrays;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] brr={0,1,2};
        System.out.println(Arrays.toString(merge(arr,brr)));
    }
    public static int[] merge(int[] arr,int[] brr){
        int[] crr=new int[arr.length+brr.length];
        int i=0,j=0,k=0;
        while(i<arr.length&&j<brr.length){
            if(arr[i]<brr[j]){
                crr[k++]=arr[i++];
            }else{
                crr[k++]=brr[j++]; 
            }
        }
        while(i<arr.length){
                crr[k++]=arr[i++];
        }
        while(j<brr.length){
                crr[k++]=brr[i++];
        }

        return crr;
    }
}
