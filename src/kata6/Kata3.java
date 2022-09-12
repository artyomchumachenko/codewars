package kata6;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f

import java.util.Arrays;
import java.util.Comparator;

public class Kata3 {

    public static void main(String[] args) {
        System.out.println(orderCopy("4of Fo1r pe6ople g3ood th5e the2"));
    }

    public static String order(String words) {
        if (words.equals("")) {
            return "";
        }
        String separator = " ";
        String[] subWords = words.split(separator);
        String[] bufferWords = new String[subWords.length];
        StringBuilder resultString = new StringBuilder();
        for (String word : subWords) {
//            String buffer = word.replaceAll("[1-9]", "");
            String numberWord = word.replaceAll("[a-zA-Z]", "");
            int number = Integer.parseInt(numberWord);
            bufferWords[number-1] = word;
        }
        for (String newWord : bufferWords) {
            if (newWord.equals(bufferWords[bufferWords.length-1])) {
                resultString.append(newWord);
            } else {
                resultString.append(newWord).append(" ");
            }
        }
        return resultString.toString();
    }

    public static String orderCopy(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
