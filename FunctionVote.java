import java.util.Scanner;
public class FunctionVote{
    public static void PrintVoteAge (int age){
        if (age>=18){
            System.out.println("Eligible");
        } else{
            System.out.println("Not Eligible");
        }
        return;

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        PrintVoteAge(age);
    }
}