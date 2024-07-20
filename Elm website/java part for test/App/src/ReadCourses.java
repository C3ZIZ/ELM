import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadCourses {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();

        try {
            File inputFile = new File("e.txt");
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] courseNames = line.split(", ");

                for (String courseName : courseNames) {
                    courses.add(courseName.trim());
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            File outputFile = new File("res.txt");
            PrintWriter writer = new PrintWriter(outputFile);

            for (String course : courses) {
                writer.print(course + ", ");
            }

            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Courses written to res.txt successfully.");
    }
}