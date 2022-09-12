package kata5;

// https://www.codewars.com/kata/55de8eabd9bef5205e0000ba

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findEmirp(100)));
    }

    public static List<Integer> primeNumbersBruteForce(long n) {
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 3; i <= n; i += 2) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        String numberString = Integer.toString(number);
        String buffer = new StringBuffer(numberString).reverse().toString();
        int numberPalindrom = Integer.parseInt(buffer);
        if (numberPalindrom == number) {
            return false;
        }
        for (int i = 2; i * i <= numberPalindrom; i++) {
            if (numberPalindrom % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long[] findEmirp(long n) {
        List<Integer> listSimpleNumbers = primeNumbersBruteForce(n);
        if (listSimpleNumbers.isEmpty()) {
            return new long[]{0, 0, 0};
        }
        int numOfSimpleNumbers = listSimpleNumbers.size();
        int largestNumber = listSimpleNumbers.get(listSimpleNumbers.size() - 1);
        int sumOfSimpleNumbers = 0;
        for (Integer value : listSimpleNumbers) {
            sumOfSimpleNumbers += value;
        }
        return new long[]{numOfSimpleNumbers, largestNumber, sumOfSimpleNumbers};
    }
}
