import java.util.Scanner;
import java.util.*;
public class StringModification{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr= sc.nextLine();
        String result="";

        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)=='e'){
                result += 'i';
            } else{
                result+= arr.charAt(i);
            }
        }
        System.out.println(result);
    }
}