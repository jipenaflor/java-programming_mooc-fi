
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        
        double ave = (double)(first + sec) / 2;
        System.out.println("The average is " + ave);

    }
}
