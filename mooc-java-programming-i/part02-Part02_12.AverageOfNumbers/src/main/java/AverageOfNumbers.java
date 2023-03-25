
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int ctr = 0;
        int num;
        double ave;
        
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
        
        ave = (double) sum / ctr;
        System.out.println("Average of the numbers: " + ave);
    }
}
