import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            library.add(new Book(title, pages, year));
            
        }
        
        System.out.println("");
        System.out.print("What information will be printed? ");
        String toPrint = scanner.nextLine();
        
        for (Book books: library) {
            if (toPrint.equals("everything")) {
                System.out.println(books);
            }
            
            if(toPrint.equals("name")) {
                System.out.println(books.getName());
            }
        }
    }
}
