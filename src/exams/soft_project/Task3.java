package exams.soft_project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {

    public static void main(String[] args) {
        String[] lineFromFile = getLinesFromFile("C:\\Users\\artyomchumachenko\\Downloads\\02 (1).txt", 999);
        int amountOfTape = 0;
        for (String line : lineFromFile) {
            String[] buffer = line.split("x");
            ArrayList<Integer> sizeList = new ArrayList<>();
            int tapeBuffer = 1;
            for (int i = 0; i < 3; i++) {
                sizeList.add(Integer.parseInt(buffer[i]));
                tapeBuffer = tapeBuffer * sizeList.get(i);
            }
            int sum = tapeBuffer;
            sizeList.remove(Collections.max(sizeList));
            for (int size : sizeList) {
                sum += size * 2;
            }
            amountOfTape += sum;
        }
        System.out.println(amountOfTape);
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
