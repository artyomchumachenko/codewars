package kata6;

// https://www.codewars.com/kata/55466989aeecab5aac00003e

import java.util.ArrayList;

public class Kata7 {

    public static void main(String[] args) {
        System.out.println(sqInRect(5, 3));
    }

    public static ArrayList<Integer> sqInRect(int lng, int wdth) {
        ArrayList<Integer> result = new ArrayList<>();
        if (lng == wdth) {
            return null;
        }
        while (true) {
            int s = lng * wdth;
            int min;
            if (lng > wdth) {
                min = wdth;
                lng -= min;
            } else {
                min = lng;
                wdth -= min;
            }
            result.add(min);
            if (lng == 0 || wdth == 0) {
                break;
            }
        }
        return result;
    }
}
