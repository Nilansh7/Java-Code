import java.util.Scanner;
public class ArrayInputString{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size :-");
        int size = sc.nextInt();
        String arrynam[]=new String[size];

        for(int i=0;i<size;i++){
            arrynam[i]=sc.next();
        }

        for(int i=0;i<arrynam.length;i++){
            System.out.println("names at " + i +"th "+"Index "+" "+ "are"+" " + arrynam[i]);
        }
    }
}