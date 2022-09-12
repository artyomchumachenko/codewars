package kata5;

// https://www.codewars.com/kata/59ccf051dcc4050f7800008f

public class Kata3 {

    public static void main(String[] args) {
        System.out.println(buddy(10, 50));
    }

    public static String buddy(long start, long limit) {
        while (start <= limit) {
            if (!checkNumber(start)) {
                start++;
            } else {
                return "(" + start + " " + sumDelsNumber(start) + ")";
            }
        }
        return "Nothing";
    }

    public static long sumDelsNumber(long number) {
        long sum = 0;
        long del;
        if (number % 2 == 0) {
            sum += number / 2;
            del = number / 2 - 1;
        } else {
            del = number / 2 + 1;
        }
        while (del != 1) {
            if (number % del == 0) {
                sum += del;
            }
            del--;
        }
        return sum;
    }

    public static boolean checkNumber(long number) {
        long firstSum = sumDelsNumber(number);
        if (firstSum == 0) {
            return false;
        }
        long secondSum = sumDelsNumber(firstSum);
        return number == secondSum;
    }
}
