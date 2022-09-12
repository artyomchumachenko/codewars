package kata6;

// https://www.codewars.com/kata/517abf86da9663f1d2000003

public class Kata4 {

    public static void main(String[] args) {
        String text = "The_Stealth_Warrior";
        System.out.println(toCamelCase(text));
    }

    static String toCamelCase(String s) {
        String resultS;
        StringBuilder sb = new StringBuilder();
        if (s.contains("-") || s.contains("_")) {
            String[] bufferWords = s.split("[-_]");
            sb.append(bufferWords[0]);
            for (int i = 1; i < bufferWords.length; i++) {
                StringBuilder buffer = new StringBuilder(bufferWords[i]);
                buffer.setCharAt(0, Character.toUpperCase(bufferWords[i].charAt(0)));
                sb.append(buffer);
            }
        } else {
            return "";
        }
        resultS = sb.toString();
        return resultS;
    }
}
