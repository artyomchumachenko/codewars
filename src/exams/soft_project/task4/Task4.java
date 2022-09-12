package exams.soft_project.task4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

public class Task4 {

    public static void main(String[] args) throws ParseException {
        String[] arrayOfDiaryEntries = getLinesFromFile("C:\\Users\\artyomchumachenko\\Downloads\\04.txt", 934);

    }

    public static String[] getLinesFromFile(String fileName, int linesAmount) {
        String[] lines = new String[linesAmount];

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {

            String line;
            int i = 0;

            while ((line = reader.readLine()) != null && i < linesAmount) {
                lines[i++] = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
