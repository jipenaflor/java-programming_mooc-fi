
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String row = read.nextLine();
                String[] entry = row.split(",");

                String name = entry[0];
                int age = Integer.valueOf(entry[1]);

                System.out.println(name + ", age: " + age + " years");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
