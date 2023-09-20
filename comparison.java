import java.util.*;
public class comparison{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        if (num_1 == num_2){
            System.out.println("Num_1 is equal to Num_2");
        } else {
            if (num_1 > num_2){
                System.out.println("Num_1 is greater than Num_2");
            } else {
                System.out.println("Num_1 is lesser than Num_2");
            }
        }
    }
}