
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        
        System.out.println(sum(list));
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer num: numbers) {
            sum += num;
        }
        
        return sum;
    }
}
