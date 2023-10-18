import java.util.*;
public class FunctionMultiply{
    public static int CalculateProduct(int a,int b ){
        int mul = a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = CalculateProduct(a,b);
        System.out.println(mul);

    }
}