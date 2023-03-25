
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try {
            Scanner reader = new Scanner(new File(file));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                if (line.isEmpty()) {
                    String name = lines.get(0);
                    int time = Integer.valueOf(lines.get(1));

                    ArrayList<String> ingredients = new ArrayList<>();
                    for (int i = 2; i < lines.size(); i++) {
                        ingredients.add(lines.get(i));
                    }

                    recipes.add(new Recipe(name, time, ingredients));
                    lines.clear();
                    continue;
                }

                lines.add(line);
            }

            String name = lines.get(0);
            int time = Integer.valueOf(lines.get(1));

            ArrayList<String> ingredients = new ArrayList<>();
            for (int i = 2; i < lines.size(); i++) {
                ingredients.add(lines.get(i));
            }
            
            recipes.add(new Recipe(name, time, ingredients));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("");

        UserInterface userInterface = new UserInterface(scanner, recipes);
        userInterface.start();
    }

}
