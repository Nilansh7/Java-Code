import java.util.Scanner;
import java.util.*;
public class ArryMinMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :-");
        int size = sc.nextInt();
        int arry[]=new int[size];

        //Input

        for(int i=0;i<size;i++){
            arry[i]=sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arry.length;i++){
            if(arry[i]<min){
                min=arry[i];
            }

            if(arry[i]>max){
                max=arry[i];
            }
        }
        System.out.println("max value is = " + max);
        System.out.println("min value is = " + min);
    }
}