
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int val = Integer.valueOf(scan.nextLine());
        double tax, taxRate;
        int taxLow, excess;
        
        if (val >= 1000000) {
            taxLow = 142100;
            taxRate = 0.17;
            excess = val - 1000000;
        } else if (val >= 200000) {
            taxLow = 22100;
            taxRate = 0.15;
            excess = val - 200000;
        } else if (val >= 55000) {
            taxLow = 4700;
            taxRate = 0.12;
            excess = val - 55000;
        } else if (val >= 25000) {
            taxLow = 1700;
            taxRate = 0.1;
            excess = val - 25000;
        } else if (val >= 5000) {
            taxLow = 100;
            taxRate = 0.08;
            excess = val - 5000;
        } else {
            taxLow = 0;
            taxRate = 0;
            excess = 0;
        }
        
        tax = taxLow + excess * taxRate;
        if (tax > 0) {
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
