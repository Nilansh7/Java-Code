import java.util.Scanner;
import java.util.*;
public class StringBuilderBrief{
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder("Tony");           // ------> String Builder
        System.out.println(sb);

        System.out.println(sb.charAt(0));                     // ------> char at index 0

        sb.setCharAt(0,'p');                              // ------> Update/Replace of any Index
        System.out.println(sb);

        sb.insert(0,'s');                                // ------> Insert anything at any index
        System.out.println(sb);

        sb.delete(0,2);                                // ------> Delete any Index Value
        System.out.println(sb);

        sb.append("x");
        System.out.println(sb);

        System.out.println(sb.length());





    }
}