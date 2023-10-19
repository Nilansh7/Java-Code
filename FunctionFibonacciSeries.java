// Fibonacci Series Logic (Sum of last two digit)
// 0 1 1 2 3 5 8 13 21 34......so on

import java.util.Scanner;
public class FunctionFibonacciSeries{
    public static void printFibonacciSeries(int term){
        int a = 0;
        int b = 1;
        int c;
        if(term>1){
            for(int i=1;i<=term;i++){
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int term = sc.nextInt();
        printFibonacciSeries(term);
    }
}
