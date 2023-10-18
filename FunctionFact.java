import java.util.*;
import java.util.Scanner;
public class FunctionFact{
    public static void PrintFactofNum (int num){
        if (num<0){
            System.out.println("Invalid");
            return;
        } 
        int fact = 1;
        for (int i=num;i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        return;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        PrintFactofNum(num);
    }
}