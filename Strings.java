import java.util.Scanner;
import java.util.*;
public class Strings{
    public static void main(String args[]){
        String name = "Kabir";
        String full_name = "Kabir Singh";
        String sentence = "My name is Kabir Singh";
        System.out.println(name);
        System.out.println(full_name);
        System.out.println(sentence);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nickname");
        String nickname = sc.next();  // sc.nextLine(); (for more then a 1 word as input we use this)
        System.out.println("nickname is:"+" "+nickname);



    }
}