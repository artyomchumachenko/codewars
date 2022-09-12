package kata6;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayStreamSort {

    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "I2 sa3y he5llo eve4ryone fir13st o1f a7ll!";
//        words[0] = "I2 sa3y he5llo eve4ryone fir13st o1f a7ll!";
        words[1] = "How your our feel today? 2";
        words[2] = "Today we perfectly our feel... 3";
        Arrays.stream(words).forEach(str -> System.out.println(str + ""));
        System.out.println(Arrays
                .stream(words[0].split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce("Result: ", (a, b) -> a + " " + b));
        String a = "4";
        System.out.println(Integer.valueOf(a));
    }
}
