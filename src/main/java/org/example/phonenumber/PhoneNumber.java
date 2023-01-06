package org.example.phonenumber;

import java.util.Arrays;

/**
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 * Example
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 */

public class PhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length == 10) {
            StringBuilder result = new StringBuilder();
            int count = 0;
            for (int number : numbers) {
                if (count == 0) {
                    result.append("(");
                } else if (count == 3) {
                    result.append(") ");
                } else if (count == 6) {
                    result.append("-");
                }
                result.append(number);
                count++;
            }
            return result.toString();
        }

        return "";
    }
}
