package kata5;

// https://www.codewars.com/kata/55ea170313b76622b3000014

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Kata2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sameFactRev(2500)));
    }

    public static int[] sameFactRev(int nMax) {
        int[] allNumbers = {1089,2178,4356,6534,8712,9801,10989,21978,24024,
                26208,42042,43956,48048,61248,65934,80262,84084,
                84216,87912,98901,109989,219978,231504,234234,
                242424,253344,255528,264264,272646,275184,277816,
                288288,405132,424242,432432,439956};
        int index = 0;
        int startValue = allNumbers[index];
        ArrayList<Integer> resultList = new ArrayList<>();

        while (startValue < nMax) {
            resultList.add(startValue);
            index++;
            startValue = allNumbers[index];
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    // разложение числа на простые множители
    public static HashSet<Integer> numberDecomposition(int x) {
        HashSet<Integer> result = new HashSet<>();
        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt) {
            if (currentValue % multiplier == 0) {
                result.add(multiplier);
                currentValue /= multiplier;
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        return result;
    }
}
