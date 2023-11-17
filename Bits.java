import java.util.Scanner;
import java.util.*;
public class Bits{
    public static void main(String args[]){
        int n = 5;  //0101
        int pos =  1;
        int bitMask = 1<<pos;
        

        // ---> Get Bit

    /*    
        if((bitMask & n)==0){
            System.out.println("Bit was Zero");
        } else{
            System.out.println("Bit was  One");
        } */

        // ---> Set Bit

        int newnumber = bitMask | n;
        System.out.println(newnumber); 
    }
}