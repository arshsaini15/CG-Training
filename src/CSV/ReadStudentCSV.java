package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
    public static void main(String[] args) {
        String filePath = "students.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                System.out.println("ID: " + id +
                        ", Name: " + name +
                        ", Age: " + age +
                        ", Marks: " + marks);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
