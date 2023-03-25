
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ctr = 0;
        int sum = 0;
        int num;
        double ave;
        
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                ctr += 1;
                sum += num;
            }
            
        }
        
        if (ctr == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            ave = (double) sum / ctr;
            System.out.println(ave);
        }
        
    }   
}
