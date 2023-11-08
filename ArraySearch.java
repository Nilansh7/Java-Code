import java.util.Scanner;
import java.util.*;
public class ArraySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :-");
        int size = sc.nextInt();
        int arry[]=new int[size];

        for(int i=0;i<size;i++){
            arry[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search ?");
        int num = sc.nextInt();

        for(int i=0;i<arry.length;i++){
            if(arry[i]==num){
                System.out.println(i);
            }
        }
    }
}