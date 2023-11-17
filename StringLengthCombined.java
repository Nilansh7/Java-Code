import java.util.Scanner;
import java.util.*;
public class StringLengthCombined{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = sc.nextInt();
        String arr[]= new String[size];

        int totalcount = 0;

        for(int i=0;i<size;i++){                                
            arr[i]=sc.nextLine();
            totalcount += arr[i].length();
        }
        System.out.println(totalcount);

    }
} 
  /*
                                          * Here's a breakdown of what's happening:
                                          * 
                                          * totLength is an integer variable initialized to 0 at the beginning of the
                                          * program. It's used to keep track of the total length of all the strings.
                                          * array[i] refers to the string stored at the i-th index in the array array.
                                          * array[i].length() returns the length of the string stored at that index.
                                          * += is a compound assignment operator that adds the value on the right-hand
                                          * side to the variable on the left-hand side and assigns the result to the
                                          * variable on the left-hand side. So, totLength += array[i].length(); adds the
                                          * length of the current string to the totLength variable.
                                          * The process is repeated for each string in the array until all the string
                                          * lengths have been added to totLength.
                                          */