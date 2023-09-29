// sum of n natural numbers

import java.util.Scanner;
public class SumNNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Digit for Sum :- ");
        int n = sc.nextInt();
                                                    // initial value of sum is 0 and at i = 1 it will add up and we have 
        int sum =0 ;                                // new value of sum which i s 1 then again it will follow for loop and 
        for(int i=1;i<=n;i++){                      // goes on now the with sum value 1 and i value 2 which will give 3 again
            sum = sum + i;                          // we have new new value of sum which is 3 and soo on......
        }
    System.out.println(sum);
    } 
}