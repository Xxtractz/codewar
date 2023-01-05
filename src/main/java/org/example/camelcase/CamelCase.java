package org.example.camelcase;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 * */

public class CamelCase {

    public static String toCamelCase(String s){

        //convert String into Char Array
        StringBuilder result = new StringBuilder();

        char[] charArray = s.toCharArray();
        boolean canCaps = false;

        for (char character: charArray){
            if (character =='-' || character == '_'){
                canCaps = true;
            }else {
                if (canCaps){
                    result.append(String.valueOf(character).toUpperCase());
                    canCaps = false;
                }else {
                    result.append(character);
                }
            }
        }
        return result.toString();
    }
}
