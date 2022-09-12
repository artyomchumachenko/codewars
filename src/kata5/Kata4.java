package kata5;

// https://www.codewars.com/kata/55c6126177c9441a570000cc

public class Kata4 {

    public static void main(String[] args) {
        System.out.println(orderWeight("11 11 2000 10003 22 123 1234000 44444444 9999"));
    }

    public static String orderWeight(String strng) {
        String[] buffer = strng.split(" ");
        int[] weight = new int[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            char[] number = buffer[i].toCharArray();
            int weightBuffer = 0;
            for (char c : number) {
                weightBuffer += Integer.parseInt(String.valueOf(c));
            }
            weight[i] = weightBuffer;
        }
        String[] result = bubbleSort(weight, buffer);
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                resultString.append(result[i]);
            } else {
                resultString.append(result[i]).append(" ");
            }
        }
        return resultString.toString();
    }

    public static String[] bubbleSort(int[] array, String[] strings) {
        boolean sorted = false;
        int temp;
        String tempString;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    tempString = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = tempString;
                    sorted = false;
                } else if (array[i] == array[i + 1]) {
                    if (strings[i].compareTo(strings[i+1]) > 0) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;

                        tempString = strings[i];
                        strings[i] = strings[i + 1];
                        strings[i + 1] = tempString;
                        sorted = false;
                    }
                }
            }
        }
        return strings;
    }
}
