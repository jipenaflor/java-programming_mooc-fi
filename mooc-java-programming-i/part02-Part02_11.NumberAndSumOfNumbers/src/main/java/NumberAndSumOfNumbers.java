
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ctr = 0;
        int sum = 0;
        int num;
        
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            
            if (num != 0) {
                ctr += 1;
                sum += num;
            } else {
                break;
            }
        }
        
        System.out.println("Number of numbers: " + ctr);
        System.out.println("Sum of the numbers: " + sum);
    }
}
