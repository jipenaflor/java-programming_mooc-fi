
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(2);
        list.add(6);
        
        printNumbersInRange(list, 0, 5);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers,
            int lowerlimit, int upperlimit) {
        for (Integer num: numbers) {
            if (num >= lowerlimit && num <= upperlimit) {
                System.out.println(num);
            }
        }
    }
}
