import java.util.Scanner;
import java.util.*;
public class TwoDArraySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int rows = sc.nextInt();
        System.out.println("Enter Columns");
        int col = sc.nextInt();
        int arry[][]=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arry[i][j]=sc.nextInt();
            }
        }
        System.out.println("Search Number");
        int n = sc.nextInt();
        boolean found =true;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arry[i][j]==n){
                    System.out.println(n +" "+ "found at index "+i+" "+j);
                    found = true;
                } 
            }
        }if(!found){
            System.out.println("not present");
        }
    }
}