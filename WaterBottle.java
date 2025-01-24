import java.util.*;
import java.util.Scanner;
public class WaterBottle{
    public static int NumWaterBottle(int numBottle,int numExchange){
        int ans = numBottle;
        while(numBottle>=numExchange){
            int newBottle = numBottle/numExchange;
            int remBottle = numBottle%numExchange;
            ans = ans + newBottle;
            numBottle = newBottle+remBottle;
        }return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of bottles");
        int numBottle = sc.nextInt();
        System.out.println("enter exchange value");
        int numExchange = sc.nextInt();
        int result = NumWaterBottle(numBottle,numExchange);
        System.out.println("Bottle a Person can Drink are : "+result);
    }
}