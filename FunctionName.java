import java.util.*;
public class FunctionName{
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the name");
        String name = sc.next();
        PrintMyName(name);
    }
}