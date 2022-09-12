package kata6;

// https://www.codewars.com/kata/55ffb44050558fdb200000a4

public class Kata1 {

    public static void main(String[] args) {
        System.out.println(sumDigNthTerm(10, new long[] {2, 1, 3}, 6));
    }

    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
        long term = initval;
        int numberTerm = 1;
        boolean termNotFind = true;
        int indexPattern = 0;
        int maxIndexPattern = patternl.length - 1;
        long sum = 0;

        while (termNotFind) {
            if (nthterm == numberTerm) {
                termNotFind = false;
                while (term != 0) {
                    sum += term % 10;
                    term = term / 10;
                }
            } else {
                if (indexPattern > maxIndexPattern) {
                    indexPattern = 0;
                }
                term = term + patternl[indexPattern];
                numberTerm++;
                indexPattern++;
            }
        }
        return sum;
    }
}
