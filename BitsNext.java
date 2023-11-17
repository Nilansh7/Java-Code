import java.util.*;
import java.util.Scanner;
public class BitsNext{
    public static void main(String args[]){
        int n =5;
        int pos = 2;
        int BitMask = 1<<pos;
        int notBitMask = ~(BitMask);

        int newnumber = notBitMask & n;
        System.out.println(newnumber);
    }
}