package exams.soft_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\artyomchumachenko\\Downloads\\02.txt"));
        int symbol = bufferedReader.read();
        int code[] = new int[5];
        int index = 0;
        int currCodeNumber = 5;
        while (symbol != -1) {
            symbol = bufferedReader.read(); // Читаем символ
            if ((char) symbol == '\n') {
                System.out.println("New string");
                code[index] = currCodeNumber;
                index++;
            }
            String currCode = String.valueOf((char) symbol);
            switch (currCodeNumber) {
                case 1 -> {
                    switch (currCode) {
                        case "D" -> currCodeNumber = 4;
                        case "R" -> currCodeNumber = 2;
                    }
                }
                case 2 -> {
                    currCodeNumber = switch (currCode) {
                        case "D" -> 5;
                        case "L" -> 1;
                        case "R" -> 3;
                        default -> currCodeNumber;
                    };
                }
                case 3 -> {
                    currCodeNumber = switch (currCode) {
                        case "D" -> 6;
                        case "L" -> 2;
                        default -> currCodeNumber;
                    };
                }
                case 4 -> {
                    currCodeNumber = switch (currCode) {
                        case "U" -> 1;
                        case "D" -> 7;
                        case "R" -> 5;
                        default -> currCodeNumber;
                    };
                }
                case 5 -> {
                    currCodeNumber = switch (currCode) {
                        case "U" -> 2;
                        case "D" -> 8;
                        case "L" -> 4;
                        case "R" -> 6;
                        default -> currCodeNumber;
                    };
                }
                case 6 -> {
                    currCodeNumber = switch (currCode) {
                        case "U" -> 3;
                        case "D" -> 9;
                        case "L" -> 5;
                        default -> currCodeNumber;
                    };
                }
                case 7 -> {
                    currCodeNumber = switch (currCode) {
                        case "U" -> 4;
                        case "R" -> 8;
                        default -> currCodeNumber;
                    };
                }
                case 8 -> {
                    currCodeNumber = switch (currCode) {
                        case "U" -> 5;
                        case "L" -> 7;
                        case "R" -> 9;
                        default -> currCodeNumber;
                    };
                }
                case 9 -> {
                    currCodeNumber = switch (currCode) {
                        case "U" -> 6;
                        case "L" -> 8;
                        default -> currCodeNumber;
                    };
                }
            }
        }
        System.out.println(Arrays.toString(code));
    }
}
