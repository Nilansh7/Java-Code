import java.util.*;
import java.util.Scanner;
public class ArrayInput{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size :-");
        int size = sc.nextInt();
        int number[]=new int[size];

        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        System.out.println("Values are :-");

        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }

    }
}