import java.util.Scanner;
public class FunctionComparison{
    public static void printComparison(int a, int b){
        if (a>b){
            System.out.println("a is greater than b");
        } else if (a<b){
            System.out.println("a is smaller than b");
        }else {
            System.out.println("a is equal to b");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printComparison(a,b);
    }
}