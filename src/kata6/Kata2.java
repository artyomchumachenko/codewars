package kata6;

// https://www.codewars.com/kata/556e0fccc392c527f20000c5

import java.util.ArrayList;
import java.util.Arrays;

public class Kata2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(xbonacci(new double []{1,0,0,0,0,0,1},10)));
    }

    public static double[] xbonacci(double[] signature, int n) {
        ArrayList<Double> resultArray = new ArrayList<>();
        //transfer signature numbers
        for (double value : signature) {
            resultArray.add(value);
        }
        int currIndex = signature.length;
        int x = signature.length;
        while (currIndex < n) {
            double newNum = 0;
            for (int i = currIndex - 1; i >= currIndex - x; i--) {
                newNum += resultArray.get(i);
            }
            resultArray.add(newNum);
            currIndex++;
        }
        double[] arr = new double[resultArray.size()];
        for (int i = 0; i < resultArray.size(); i++) {
            arr[i] = resultArray.get(i);
        }
        return arr;
    }
}
