import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    // Reference variables
    private String studentId;
    private String name;

    // Constructor to initialize student details
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Getter methods
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Overriding toString method for formatted output
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + studentId;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        String fileName = "students.csv";

        // Reading the CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // Skip the header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                students.add(new Student(data[0], data[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Collections.sort(students, Comparator.comparing(Student::getName));


        for (Student student : students) {
            System.out.println(student);
        }
    }
}
