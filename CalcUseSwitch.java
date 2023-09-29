import java.util.Scanner;
public class CalcUseSwitch{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first Number :- ");
        int a = sc.nextInt();
        System.out.println("Enter the secong Number :- ");
        int b = sc.nextInt();
        System.out.println("Enter the operators button :- ");
        int Operators = sc.nextInt();
        

        /*

         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         
         */

        switch(Operators){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println("a-b");
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if (b==0){
                System.out.println("Invalid");
            } else {
                System.out.println(a/b);
            }
            break;
            case 5 : if (b==0){
                System.out.println("Invalid Number");
            } else{
                System.out.println(a%b);
            }

        }
    }
}