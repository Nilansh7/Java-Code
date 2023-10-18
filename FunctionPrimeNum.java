import java.util.*;
import java.util.Scanner;
public class FunctionPrimeNum{
    public static void PrintPrimeNum(int num){
        boolean isPrime=true;
        
        for(int i=2;i<=num/2;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        if(isPrime){
            if(num==1){
                System.out.println("Neither prime nor composite");
            } else{
                System.out.println("is prime number");
            }
        } else{
            System.out.println("not a prime number");
        }
        System.out.println(num);
        return;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        PrintPrimeNum(num);

    }
}