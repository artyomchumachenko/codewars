package exams.soft_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        File doc =
                new File("C:\\Users\\artyomchumachenko\\Downloads\\01.txt");
        Scanner obj = new Scanner(doc);
        int sum = 0;

        while (obj.hasNextLine()) {
            String string = obj.nextLine();
            String what = string.substring(0, 1);
            String freq = string.substring(1);
            System.out.println(freq);
            if (what.equals("+")) {
                sum += Integer.parseInt(freq);
            } else {
                sum -= Integer.parseInt(freq);
            }
        }
        System.out.println("Result: " + sum);
    }
}
