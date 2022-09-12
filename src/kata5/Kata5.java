package kata5;

// https://www.codewars.com/kata/52f787eb172a8b4ae1000a34

public class Kata5 {

    public static void main(String[] args) {
        System.out.println(zeros(999));
    }

    public static int zeros(int n) {
        return zerosFactorialTrailing(n);
    }

    public static int zerosFactorialTrailing(int n) {
        int fives = 0;
        for (int i = 5; i <= n; i *= 5) {
            fives += n / i;
        }
    /*
     * There are always more twos than fives
     *
    int twos = 0;
    for (int i = 2; i <= n; i *= 2) {
        twos += n / i;
    }
    return Math.min(twos, fives);
    */
        return fives;
    }

    // This function finds factorial of
    // large numbers and prints them
    static int factorial(int n)
    {
        int res[] = new int[Integer.MAX_VALUE];

        // Initialize result
        res[0] = 1;
        int res_size = 1;

        // Apply simple factorial formula
        // n! = 1 * 2 * 3 * 4...*n
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        int index = 0;
        for (int i = 0; i < res_size; i++) {
            if (res[i] == 0) {
                index++;
            } else {
                break;
            }
        }
        return index;
    }

    // This function multiplies x with the number
    // represented by res[]. res_size is size of res[] or
    // number of digits in the number represented by res[].
    // This function uses simple school mathematics for
    // multiplication. This function may value of res_size
    // and returns the new value of res_size
    static int multiply(int x, int res[], int res_size)
    {
        int carry = 0; // Initialize carry

        // One by one multiply n with individual
        // digits of res[]
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of
            // 'prod' in res[]
            carry = prod / 10; // Put rest in carry
        }

        // Put carry in res and increase result size
        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
}
