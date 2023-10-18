import java.util.Scanner;
public class FunctionCircle{
    public static void printCircle (int r){
        double pi = 3.14;
        double circle = 2*pi*r;
        System.out.println(circle);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
        printCircle(r);
    }
}