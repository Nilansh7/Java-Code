import java.util.*;
public class MinMaxSecMinSecMax{
    public static void main(String args[]){
        int[] arr = {7,7,7,7,7,7};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smax = Integer.MIN_VALUE;
        int smin = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }if(arr[i]<min){
                smin=min;
                min=arr[i];
            }else if(arr[i]<smin && arr[i]>min){
                smin=arr[i];
            }
        }System.out.println("Max element is : "+max);
        if(smax==Integer.MIN_VALUE){
            System.out.println("No Second max element");
        }else {
            System.out.println("Second Max element is : "+smax);
        }System.out.println("Min element is : "+min);
        if(smin==Integer.MAX_VALUE){
            System.out.println("No second min element");
            
        }else {
            System.out.println("Second Min element is : "+smin);
        }
    }
}