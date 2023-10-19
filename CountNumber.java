import java.util.Scanner;

public class CountNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.println("Enter the Number:");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.println("Do you want to continue? Yes(Y) , No(N)");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Positive Numbers: " + positiveCount);
        System.out.println("Negative Numbers: " + negativeCount);
        System.out.println("Zero Numbers: " + zeroCount);
        sc.close();
    }
}
