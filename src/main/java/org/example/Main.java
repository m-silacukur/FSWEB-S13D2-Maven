package org.example;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 0)
            return false;
        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {

        if (number < 0)
            return "Invalid Value";

        if (number == 0)
            return "Zero";

        String[] words = {
                "Zero","One","Two","Three","Four",
                "Five","Six","Seven","Eight","Nine"
        };

        String numStr = String.valueOf(number);

        String result = "";

        for (int i = 0; i < numStr.length(); i++) {

            int digit = numStr.charAt(i) - '0';

            result += words[digit];

            if (i != numStr.length() - 1)
                result += " ";
        }

        return result;
    }

}
