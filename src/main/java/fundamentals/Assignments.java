package fundamentals;

import java.util.Arrays;
public class Assignments {
    public  double divideByTwo(double num) {
        if (num == 0) {
            throw new ArithmeticException("You can't divide the number zero");
        }
        return  num / 2;
    }

    public  double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("You can't divide the number zero");
        }
        return  x / y;
    }

    public  int checkLength(String text) {
        if (text == null) {
            throw new IllegalArgumentException("text can't be null");
        }
        return text.length();
    }

    public  void validateLength(String text) throws TextTooLongException, TextTooShortException {
        int textLength = checkLength(text);
        if (textLength > 10) {
            throw new TextTooLongException("Text is too long");
        } else if (textLength < 4) {
            throw new TextTooShortException("Text is too short");
        }
    }

    public  String reverse(String text) {
        if (text == null) {
            throw new IllegalArgumentException("text can't be null");
        }
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    public  boolean checkAnagram(String text1, String text2) {
        if (text1 == null || text2 == null) {
            throw new IllegalArgumentException("text can't be null");
        }
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();
        if (text1.length() != text2.length()) {
            return false;
        }
        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public  boolean checkPalindrome(String text1, String text2) {
        if (text1 == null || text2 == null) {
            throw new IllegalArgumentException("text can't be null");
        }
        String combined = text1 + text2;
        int length = combined.length();
        for (int i = 0; i < length / 2; i++) {
            if (combined.charAt(i) != combined.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public  int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number can't be negative number");
        }
        int obj = 1;
        for (int i = 1; i <= n; i++) {
            obj *= i;
        }
        return obj;

    }

    public  int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number can't be negative number");
        }else if (n <= 1) {
            return n;
        }
        int x1 = 0;
        int x2 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        return x2;

    }


}

