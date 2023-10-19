import java.util.Scanner;
import java.util.*;
public class FunctionPower{
    public static void printpower(int x , int n){
        int pow=1;
        for(int i=1;i<=n;i++){
            pow= pow*x;   
        }
        System.out.println(pow);
        return;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        printpower(x,n);
    }
}