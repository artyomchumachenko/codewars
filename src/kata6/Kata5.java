package kata6;

// https://www.codewars.com/kata/622de76d28bf330057cd6af8

public class Kata5 {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(amountOfPages(25));
        System.out.println(System.currentTimeMillis() - time);

//        long time2 = System.currentTimeMillis();
//        System.out.println(amountOfPages2(1753287587));
//        System.out.println(System.currentTimeMillis() - time2);
    }

    public static int amountOfPages(int summary) {
        int index = 1;
        double bufferSum = summary;
        boolean isSearch = true;
        boolean initKef = true;
        double kef = 0;

        int sumIterations = 0;

        while (isSearch) {
            if (summary < Math.pow(10, index)) {
                sumIterations++;
                for (int step = 0; step < index; step++) {
                    sumIterations++;
                    if (bufferSum - (9 * Math.pow(10, step) * (step + 1)) > 0) {
                        bufferSum = bufferSum - (9 * Math.pow(10, step) * (step + 1));
                    } else {
                        initKef = false;
                        kef = Math.pow(10, step) - 1;
                        index = step + 1;
                        break;
                    }
                }
                if (initKef) {
                    kef = Math.pow(10, index) - 1;
                }
                bufferSum = bufferSum / index;
                bufferSum = bufferSum + kef;
                isSearch = false;
            } else {
                index++;
            }
        }
        System.out.println(sumIterations + " sum iter 2 algorithm");
        return (int) bufferSum;
    }

    public static int amountOfPages2(int summary) {
        int nums = 0;
        int digits = 0;

        int sumIterations = 0;

        while (nums < summary) {
            digits++;
            nums += String.valueOf(digits).length();
            sumIterations++;
        }
        System.out.println(sumIterations + " sum iter 2 algorithm");
        return digits;
    }
}
