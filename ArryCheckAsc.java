import java.util.Scanner;
import java.util.*;
public class ArryCheckAsc{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int arry[]=new int[size];

        //INPUT

        for(int i=0;i<size;i++){
            arry[i]=sc.nextInt();
        }

        //Assigning Flag

        Boolean isAscending=true;

        //Checking the Array

        for(int i=0;i<arry.length-1;i++){
            if(arry[i]>arry[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
                System.out.println("Array is Formed in Ascending order");
            } else {
                System.out.println("Array is not Formed in Ascending order");
            }
    }
}