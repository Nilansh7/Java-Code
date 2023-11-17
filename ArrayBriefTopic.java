import java.util.Scanner;
import java.util.*;
public class ArrayBriefTopic{
    public static void main(String args[]){
        
        // CONCATENATION  (Adding of String)           <-----------

        Scanner sc = new Scanner(System.in);
        String first_name = sc.nextLine();
        String last_name = sc.nextLine();
        String full_name = first_name + " "+ last_name;            
        System.out.println(full_name);
        System.out.println(full_name.length()); 

        // charAt()                                    <-----------

        for(int i=0;i<full_name.length();i++){             // all single character in next line
            System.out.println(full_name.charAt(i));          
        } 

     /*   // Compare                                    <-----------

        String name1 = "kabir";
        String name2 = "kabir";

        //1 s1 > s2 : +ve number
        // s1 == s2 : 0
        // s1 < s2 : -ve number  
        
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        } else{
            System.out.println("String are not equal");
        } */

            // substring(beg index, end index)         <-------------

   /*     String sentence = "My name is Kabir Singh";        
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
        */
        
    }
}


                    // Strings are Imutable (YOU CAN NOT CHANGE THE STRING)