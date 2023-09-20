import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);         // INPUT 1
        String name = sc.next();                     // Print only the 1st token

        Scanner ab = new Scanner(System.in);         // INPUT 2
        String full_name = sc.nextLine();            // Print the whole line

        System.out.println(name);
        System.out.println(full_name);

        // sc.nextLine()    use for string
        // sc.nextInt()     use for Int
        // sc.nextfloat()   use for float
    }
    
}