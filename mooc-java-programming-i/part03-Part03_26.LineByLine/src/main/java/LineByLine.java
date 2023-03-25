
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            String[] words = text.split(" ");
            printWords(words);
        }
    }
    
    public static void printWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
