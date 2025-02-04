import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] arr = {-1,-1,-2};
        int largest = arr[0];
        int secondlargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest=arr[i];
            }
        }if(largest==secondlargest){
            System.out.println("NO SECOND LARGEST");
            return;
        }else{
            System.out.println(secondlargest);
        }
    }
}