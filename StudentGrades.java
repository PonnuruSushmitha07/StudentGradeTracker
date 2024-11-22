import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter student grades (enter -1 to finish):");

        while (true) {
            System.out.print("Grade: ");
            int grade = scanner.nextInt();

            // Exit the loop if the user enters -1
            if (grade == -1) {
                break;
            }

            // Validate that the grade is between 0 and 100
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            // Calculate average, highest, and lowest grades
            double average = calculateAverage(grades);
            int highest = findHighest(grades);
            int lowest = findLowest(grades);

            System.out.println("\nResults:");
            System.out.printf("Average grade: %.2f%n", average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }

        scanner.close();
    }

    // Calculate the average grade
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Find the highest grade
    public static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Find the lowest grade
    public static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
