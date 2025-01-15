import java.util.*;
import java.util.Scanner;
public class fibonacci{
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        
        int first = 0;
        int second = 1;
        for(int i=2;i<=n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
        
    }
}