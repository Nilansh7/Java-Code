import java.util.Scanner;
public class FunctionSumODD{
    public static void printOddNo(int num){
        int odd=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                odd=odd+i;
                }
            } System.out.println(odd);
            return;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            int num = sc.nextInt();
            printOddNo(num);
    }
}