
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            int point = Integer.valueOf(input);
            if (point == -1) {
                break;
            }
            if ((point >= 0) & (point <= 100)) {
                grades.add(point);
            }
        }
        
        // Point averages
        System.out.println("Point average (all): " + average(grades));
        
        // Point average for points giving a passing grade
        if (passingAverage(grades) > 0) {
            System.out.println("Point average (passing): " + passingAverage(grades));
        } else {
            System.out.println("Point average (passing): -");
        }
        
        // Pass percentage
        System.out.println("Pass percentage: " + passPercentage(grades));
        
        // Grade distribution
        gradeDistribution(grades);
    }
    
    public static double average(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
        return sum * 1.0 / grades.size();
    }
    
    public static double passingAverage(ArrayList<Integer> grades) {
        ArrayList<Integer> passed = new ArrayList<>();
        for (int grade: grades) {
            if (grade >= 50) {
                passed.add(grade);
            }
        }
        return average(passed);
    }
    
    public static double passPercentage(ArrayList<Integer> grades) {
        ArrayList<Integer> passed = new ArrayList<>();
        for (int grade: grades) {
            if (grade >= 50) {
                passed.add(grade);
            }
        }
        return 100.0 * passed.size() / grades.size();
    }
    
    public static String printStars(int grade) {
        String stars = "";
        for (int i = 0; i < grade; i++) {
            stars += "*";
        }
        return stars;
    }
    
    public static void gradeDistribution(ArrayList<Integer> grades) {
        int g0 = 0, g1 = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0;
        for (int grade: grades) {
            if (grade < 50) {
                g0++;
            } else if (grade < 60) {
                g1++;
            } else if (grade < 70) {
                g2++;
            } else if (grade < 80) {
                g3++;
            } else if (grade < 90) {
                g4++;
            } else {
                g5++;
            }
        }
        
        System.out.println("Grade distribution:");
        System.out.println("5: " + printStars(g5));
        System.out.println("4: " + printStars(g4));
        System.out.println("3: " + printStars(g3));
        System.out.println("2: " + printStars(g2));
        System.out.println("1: " + printStars(g1));
        System.out.println("0: " + printStars(g0));
    }
}
