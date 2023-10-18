import java.util.Scanner;
public class FunctionEven{
    public static void PrintEvenNo(int num){
        if (num%2==0){
            System.out.println("Even Number");
        } else{
            System.out.println("Not a Even Number");
        }
        return;
    }
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            PrintEvenNo(num);
    }
}